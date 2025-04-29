package com.cloudframe.app.bm80022.dto;

/**
*  The class Contadors is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Contadors extends ContadorsSerialized {
   

								@Getter @Setter private long llegitsGe1801;

								@Getter @Setter private long gravatsGe0001w;
	
	/**
	* Constructor for Contadors
	**/
    public Contadors() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setLlegitsGe1801(0L);
								setGravatsGe0001w(0L);
    }



	/**
	 * 	initializes Contadors
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setLlegitsGe1801(0);
                     setGravatsGe0001w(0);
   }


}
  
