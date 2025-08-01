import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';

export type titleSize = 'extra-small' | 'small' | 'medium' | 'large' | 'extra-large' | 'huge';
export type titleColor = 'primary' | 'secondary' | 'tertiary' | 'neutral';
export type fontWeightType = 'thin' | 'light' | 'regular' | 'medium' | 'bold';

@Component({
  selector: 'app-title',
  imports: [CommonModule],
  templateUrl: './title.component.html',
  styleUrl: './title.component.css'
})
export class TitleComponent {
  @Input() size: titleSize = 'small';
  @Input() color: titleColor = 'primary';
  @Input() fontWeight: fontWeightType = 'regular';
  @Input() isSelectable: boolean = true;
  @Input() hasHoverEffect: boolean = false;

  public get titleClasses(): string {
    const classes = [
      'title',
      `title--${this.size}`,
      `title--${this.color}`,
      this.fontWeight === 'medium' ? 'title--weight-medium' : `title--${this.fontWeight}`,
      this.hasHoverEffect ? 'title--hoverable' : '',
      this.isSelectable ? 'title--selectable' : '',
    ].filter(Boolean).join(' ');
    return classes;
  }
}
