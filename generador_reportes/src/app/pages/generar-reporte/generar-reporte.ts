import { Component, inject, OnInit, signal } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { environment } from '../../../environments/environment';
import { MateriaUser } from '../../interfaces/materia-user.interface';

@Component({
  selector: 'app-generar-reporte',
  imports: [RouterModule],
  templateUrl: './generar-reporte.html',
  styleUrl: './generar-reporte.css'
})
export class GenerarReporte implements OnInit {
  private http = inject(HttpClient);
  materias = signal<MateriaUser[]>([]);
  private userId = 1;

  ngOnInit(): void {
    this.http.get<MateriaUser[]>(`${environment.apiUrl}/materiasUser/obtener?id_user=${this.userId}`)
      .subscribe({
        next: (data) => {
          console.log('Datos recibidos del backend:', data);
          this.materias.set(data);
        },
        error: (error) => {
          console.error('Error al obtener materias:', error);
          window.alert('Ocurrió un error al obtener las materias. Por favor, inténtelo de nuevo más tarde.');
        }
      });
  }
}