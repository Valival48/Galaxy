package pe.edu.upc.galaxy.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;

@Controller
public class CalculoController {

	//Monto a financiar
	public static double DescuentoParaTasaNominal(Float perTasaNominalConPorcentaje, int NumDiasTasa, int NumDiasPeriodoCapitalizacion, Date DPago, Date DDescuento, float ValorNominal, float GastoInicialTotal, float GastoFinalTotal){
		
		double perTasaNominal=(double)perTasaNominalConPorcentaje/(double)100;
		
		long CantidadDiasLong = (long)(DDescuento.getTime()/86400000)-(long)(DPago.getTime()/86400000);
		double CantidadDias=(double)CantidadDiasLong;
		CantidadDias=Math.abs(CantidadDias);
		
		double TEA = Math.pow(1+(perTasaNominal)/(double)(NumDiasTasa/NumDiasPeriodoCapitalizacion),CantidadDias/(double)NumDiasPeriodoCapitalizacion)-1;
		
		
		return 0 ;
	}
	
	public static double DescuentoParaTasaEfectiva (Float perTasaEfectivaPorcentaje, int NumDiasTasa, int NumDiasVenci , double Monto ) {
		
		double perTasaEfectiva=(double) perTasaEfectivaPorcentaje/(double)100;
		
		double desembolso = Monto+(Math.pow(1+perTasaEfectiva, NumDiasVenci/NumDiasTasa));
		return desembolso;
	}
	
}
