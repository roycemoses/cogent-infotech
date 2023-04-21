import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoutingCareersComponent } from './routing-careers.component';

describe('RoutingCareersComponent', () => {
  let component: RoutingCareersComponent;
  let fixture: ComponentFixture<RoutingCareersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RoutingCareersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RoutingCareersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
