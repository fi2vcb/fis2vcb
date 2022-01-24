import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TransferTrongvxComponent } from './transfer-trongvx.component';

describe('TransferTrongvxComponent', () => {
  let component: TransferTrongvxComponent;
  let fixture: ComponentFixture<TransferTrongvxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TransferTrongvxComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TransferTrongvxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
