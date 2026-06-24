import { Routes } from '@angular/router';
import { GenerarReporte } from './pages/generar-reporte/generar-reporte';
import { UnidadEconomica } from './pages/generar-reporte/unidad-economica/unidad-economica';
import { InstitucionEducativa } from './pages/generar-reporte/institucion-educativa/institucion-educativa';

export const routes: Routes = [
  { path: '', redirectTo: 'generarReporte', pathMatch: 'full' },
  { path: 'generarReporte', component: GenerarReporte },
  { path: 'generarReporte/institucion-ducativa', component: InstitucionEducativa },
  { path: 'generarReporte/unidad-economica', component: UnidadEconomica }
];