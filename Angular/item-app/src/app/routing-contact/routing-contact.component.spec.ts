import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoutingContactComponent } from './routing-contact.component';

describe('RoutingContactComponent', () => {
  let component: RoutingContactComponent;
  let fixture: ComponentFixture<RoutingContactComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RoutingContactComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RoutingContactComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
