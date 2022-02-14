import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Transaction } from '../common/transaction';
import { TransferServiceService } from '../services/transfer-service.service';

@Component({
  selector: 'app-transfer',
  templateUrl: './transfer.component.html',
  styleUrls: ['./transfer.component.css']
})
export class TransferComponent implements OnInit {
  mainFormGroup: FormGroup;
  constructor(private formBuilder: FormBuilder,
    private transferService: TransferServiceService) { }

  ngOnInit(): void {
    this.mainFormGroup = this.formBuilder.group({
      customer: this.formBuilder.group({
        tkgui: new FormControl('', []),
        tknhan: new FormControl('', []),
        sotien: new FormControl('', [])
      })
    })
  }

  get tkgui() { return this.mainFormGroup.get('customer.tkgui'); }
  get tknhan() { return this.mainFormGroup.get('customer.tknhan'); }
  get sotien() { return this.mainFormGroup.get('customer.sotien'); }

  onSubmit() {
    console.log("Handling the submit button");
    let trans = new Transaction();
    trans.tkgui = this.mainFormGroup.get('customer.tkgui').value;
    trans.tknhan = this.mainFormGroup.get('customer.tknhan').value;
    trans.sotien = this.mainFormGroup.get('customer.sotien').value;
    this.transferService.startTransfer(trans).subscribe({
      next: res => { alert('Success!'); this.resetMainForm(); },
      error: res => { alert('Error!'); }
    })
  }
  resetMainForm() {
    this.mainFormGroup.reset();
  }

}
