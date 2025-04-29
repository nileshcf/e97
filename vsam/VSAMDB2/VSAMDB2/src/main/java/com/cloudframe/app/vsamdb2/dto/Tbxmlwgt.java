package com.cloudframe.app.vsamdb2.dto;

/**
*  The class Tbxmlwgt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Tbxmlwgt extends TbxmlwgtSerialized {
   

						@Getter @Setter private char[] widgetNum = Field.fillLowValue(8);

						@Getter @Setter private char[] widgetColor = Field.fillLowValue(6);

								@Getter @Setter private BigDecimal widgetPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] widgetDesc = Field.fillLowValue(20);
	
	/**
	* Constructor for Tbxmlwgt
	**/
    public Tbxmlwgt() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
