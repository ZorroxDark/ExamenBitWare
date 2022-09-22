import { Injectable } from '@angular/core';
import { map } from 'rxjs';
import {Observable} from 'rxjs';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import { Persona } from './models/persona';

@Injectable({
  providedIn: 'root'
})
export class InfoService {

  constructor( private http: HttpClient) { }

  /*wsInfoPersona(params: any): Observable<any> {
    return this.http
        .post<any>("http://localhost:8080/getPersona", params, {})
        .pipe(map((data) => data));
}*/

wsInfoPersona(p: Persona): Observable<Persona> {
  console.log("personas");
  return this.http.post<Persona>("http://localhost:8080/getPersona",p).pipe (
    map((data) => data)
     );
}
}
