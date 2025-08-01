import { Component, Input, Output, EventEmitter } from '@angular/core';

export type ButtonType = 'primary' | 'secondary' | 'tertiary' | 'neutral' | 'outline' | 'ghost';
export type ButtonSize = 'extra-small' | 'small' | 'medium' | 'large' | 'extra-large' | 'huge';
export type borderType = 'none' | 'thin' | 'thick';
export type fontWeightType = 'thin' | 'light' | 'regular' | 'medium' | 'bold';

@Component({
  selector: 'app-button',
  imports: [],
  templateUrl: './button.component.html',
  styleUrl: './button.component.css'
})
export class ButtonComponent {
  @Input() type: ButtonType = 'primary';
  @Input() size: ButtonSize = 'small';
  @Input() border: borderType = 'none';
  @Input() fontWeight: fontWeightType = 'regular';
  @Input() disabled: boolean = false;
  @Input() isFullWidth: boolean = false;
  @Input() ariaLabel: string = '';
  @Output() click: EventEmitter<Event> = new EventEmitter<Event>();

  public get buttonClasses(): string {
    const classes = [
      'button',
      `button--${this.type}`,
      `button--${this.size}`,
      `button--${this.fontWeight}`,
      this.isFullWidth ? 'button--full-width' : '',
    ].filter(Boolean).join(' ');
    return classes;
  }

  public get borderStyle(): string {
    if (this.border === 'none') { 
      return 'none';
    }
    return `var(--border-${this.border === 'thin' ? '1' : '2'}-${this.type}-3)`;
  }

  public onClick(event: Event): void {
    this.click.emit(event);
  }
}
