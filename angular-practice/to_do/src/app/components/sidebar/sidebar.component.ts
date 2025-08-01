import { Component } from '@angular/core';
import { ButtonComponent } from "../button/button.component";
import { TitleComponent } from "../title/title.component";

@Component({
  selector: 'app-sidebar',
  imports: [ButtonComponent, TitleComponent],
  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.css'
})
export class SidebarComponent {

}
