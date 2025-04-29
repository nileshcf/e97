package com.cloudframe.app.db2varch.dto;

/**
*  The class Ibook is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ibook extends IbookSerialized {
   
      private List<Short> indstruc; 

	
	/**
	* Constructor for Ibook
	**/
    public Ibook() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ibook
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
            for (int index =0; index < INDSTRUC_SIZE;index++) {
                  setIndstruc(index,(short)0);
            }
   }


}
  
