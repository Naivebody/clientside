import { Component } from '@angular/core';
import UnityPlugin from "capacitor-unity-plugin/src";



@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss'],
  standalone: false,
})
export class Tab1Page {

  constructor() {}


  async startUnity() {
    try {
      await UnityPlugin.startUnity();
      console.log('Unity started');
    } catch (error) {
      console.error('Failed to start Unity:', error);
    }
  }
}
