import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';

export type textSize = 'extra-small' | 'small' | 'medium' | 'large' | 'extra-large' | 'huge';
export type textColor = 'primary' | 'secondary' | 'tertiary' | 'neutral';
export type fontWeightType = 'thin' | 'light' | 'regular' | 'medium' | 'bold';

@Component({
  selector: 'app-text',
  imports: [CommonModule],
  templateUrl: './text.component.html',
  styleUrl: './text.component.css'
})
export class TextComponent {
  @Input() size: textSize = 'small';
  @Input() color: textColor = 'primary';
  @Input() fontWeight: fontWeightType = 'regular';
  @Input() isSelectable: boolean = true;
  @Input() hasHoverEffect: boolean = false;

  public get textClasses(): string {
    const classes = [
      'text',
      `text--${this.size}`,
      `text--${this.color}`,
      `text--${this.fontWeight}`,
      this.hasHoverEffect ? 'text--hoverable' : '',
      this.isSelectable ? 'text--selectable' : '',
    ].filter(Boolean).join(' ');
    return classes;
  }
}
