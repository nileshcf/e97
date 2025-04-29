package com.cloudframe.app.dbissues.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] fsFiz018i = Field.fillLowValue(2);

						@Getter @Setter private char[] fsFiz018o = Field.fillLowValue(2);

								@Getter @Setter private BigDecimal bodyHeight = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bodyHeightAux = BigDecimal.ZERO;

								@Getter @Setter private int heightBloqtotal;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBodyHeight(BigDecimal.ZERO);
								setBodyHeightAux(BigDecimal.ZERO);
								setHeightBloqtotal(0);
    }





}
  
