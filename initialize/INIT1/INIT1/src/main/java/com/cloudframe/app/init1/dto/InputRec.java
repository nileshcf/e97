package com.cloudframe.app.init1.dto;

/**
*  The class InputRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.common.CONSTANTS;
import java.util.ArrayList;


@Data
public class InputRec extends InputRecSerialized {
   

						@Getter @Setter private char[] inputEmplId = Field.fillLowValue(7);

						@Getter @Setter private char[] inputLastName = Field.fillLowValue(15);

						@Getter @Setter private char[] inputFirstName = Field.fillLowValue(15);

						@Getter @Setter private char[] inputEmplType = Field.fillLowValue(2);

						@Getter @Setter private char[] inputEmplClass = Field.fillLowValue(17);

						@Getter @Setter private char[] inputEmplSsn = Field.fillLowValue(9);


						@Getter @Setter private char[] inputEmplStartDate = Field.fillLowValue(8);


								@Getter @Setter private BigDecimal inputEmplRate = BigDecimal.ZERO;

						@Getter @Setter private char[] inputEmplStatus = Field.fillLowValue(1);
      private List<BigDecimal> inputDeductions; 

	
	/**
	* Constructor for InputRec
	**/
    public InputRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes InputRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setInputEmplId(CONSTANTS.SPACE_7);
         setInputLastName(CONSTANTS.SPACE_15);
         setInputFirstName(CONSTANTS.SPACE_15);
         setInputEmplType(CONSTANTS.SPACE_2);
         setInputEmplClass(CONSTANTS.SPACE_17);
         setInputEmplSsn(CONSTANTS.SPACE_9);
         setInputEmplStartDate(CONSTANTS.SPACE_8);
			setInputEmplRate(BigDecimal.ZERO);
         setInputEmplStatus(CONSTANTS.SPACE);
            for (int index =0; index < INPUT_DEDUCTIONS_SIZE;index++) {
             setInputDeductions(index, BigDecimal.ZERO);
            }
   }


}
  
