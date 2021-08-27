import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MaincontentsComponent } from './maincontents.component';

describe('MaincontentsComponent', () => {
  let component: MaincontentsComponent;
  let fixture: ComponentFixture<MaincontentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MaincontentsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MaincontentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
