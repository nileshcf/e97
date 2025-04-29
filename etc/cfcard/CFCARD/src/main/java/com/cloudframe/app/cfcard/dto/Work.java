package com.cloudframe.app.cfcard.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] currentCard = new char[16];

								@Getter @Setter private BigDecimal outTotal = BigDecimal.ZERO;

						@Getter @Setter private char[] inp1Status = Field.fillLowValue(2);

						@Getter @Setter private char[] outpStatus = Field.fillLowValue(2);

						@Getter @Setter private char[] doneStatus = new char[1];

								@Getter @Setter private long inp1Cnt;

								@Getter @Setter private long outpCntW;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCurrentCard(("0000000000000000").toCharArray());
								setOutTotal(BigDecimal.ZERO);
								setDoneStatus(("S").toCharArray());
    }





}
  
