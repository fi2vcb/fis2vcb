import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CIFQueryComponent } from './cif-query.component';

describe('CIFQueryComponent', () => {
  let component: CIFQueryComponent;
  let fixture: ComponentFixture<CIFQueryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CIFQueryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CIFQueryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
