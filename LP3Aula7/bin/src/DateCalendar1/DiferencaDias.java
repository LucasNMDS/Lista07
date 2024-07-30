package DateCalendar1;

//Criar um programa que calcula a diferença em dias entre duas datas.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

	public class DiferencaDias {

	    public static void main(String[] args) {
	        
	        LocalDate data1 = LocalDate.of(2024, 1, 1);
	        LocalDate data2 = LocalDate.of(2024, 6, 1); 

	        long diferencaDias = ChronoUnit.DAYS.between(data1, data2);

	        System.out.println("Quantidade de dias entre 01/01/2024 e 01/06/2024: " + diferencaDias);
	    }
	}
