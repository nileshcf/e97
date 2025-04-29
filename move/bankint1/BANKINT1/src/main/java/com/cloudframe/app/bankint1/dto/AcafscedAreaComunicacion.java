package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedAreaComunicacion is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AcafscedAreaComunicacion extends AcafscedAreaComunicacionSerialized {
   
				@Getter @Setter private AcafscedSalida acafscedSalida = new AcafscedSalida();
	
	/**
	* Constructor for AcafscedAreaComunicacion
	**/
    public AcafscedAreaComunicacion() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAcafscedSalida().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }



	/**
	 * 	initializes AcafscedAreaComunicacion
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getAcafscedSalida().initialize();
     
   }


}
  
