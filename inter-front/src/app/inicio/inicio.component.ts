import { Component, OnInit } from '@angular/core';
import { Persona } from '../models/persona';
import { InfoService } from '../info.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  personaRequest :Persona = new Persona();
  personaResponse :Persona = new Persona();

  constructor(private infoSer:InfoService,
    ) { }

  ngOnInit(): void {
  }

  calcular()  {
    
    this.consultaServicio();

    
  }

  consultaServicio(){
    this.infoSer.wsInfoPersona(this.personaRequest).subscribe (
      data => {
          console.log("Se ha registrado exitosamente la cita");
          this.personaResponse = data;
          console.log("==================");
          console.log(this.personaResponse);
        
      },
      error => {
          console.log("error");
      }
)}
  
}
