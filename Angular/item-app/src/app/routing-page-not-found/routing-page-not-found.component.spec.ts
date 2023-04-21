import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoutingPageNotFoundComponent } from './routing-page-not-found.component';

describe('RoutingPageNotFoundComponent', () => {
  let component: RoutingPageNotFoundComponent;
  let fixture: ComponentFixture<RoutingPageNotFoundComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RoutingPageNotFoundComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RoutingPageNotFoundComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
