package com.cloudframe.app.comput5.dto;

/**
*  The class WpReptext is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WpReptext extends WpReptextSerialized {
   
				@Getter @Setter private WpReptextPrintLine wpReptextPrintLine = new WpReptextPrintLine();
	
	/**
	* Constructor for WpReptext
	**/
    public WpReptext() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWpReptextPrintLine().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }



	/**
	 * 	initializes WpReptext
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getWpReptextPrintLine().initialize();
     
   }


}
  
