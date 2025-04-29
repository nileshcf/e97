package com.cloudframe.app.sqlcount.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short shortCountComp;

								@Getter @Setter private int intCountComp;

								@Getter @Setter private long longCountComp;

								@Getter @Setter private short countComp34;

								@Getter @Setter private int countComp38;

								@Getter @Setter private long countComp311;

								@Getter @Setter private long countComp314;

								@Getter @Setter private BigDecimal countComp3104 = BigDecimal.ZERO;

								@Getter @Setter private char[] countEdit = Field.fillLowValue(14);

								@Getter @Setter private char[] countEdit2 = Field.fillLowValue(15);

								@Getter @Setter private char[] sqlcode_Ws = Field.fillLowValue(4);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
