package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01DescSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


@Data
public class Bdms01DescSegData extends Bdms01DescSegDataSerialized { 
   

								@Getter @Setter private int bdms01DescSegSqlcd;

						@Getter @Setter private char[] msdSecurityDesc2 = Field.fillLowValue(30);

						@Getter @Setter private char[] msdSecurityDesc3 = Field.fillLowValue(30);

						@Getter @Setter private char[] msdBondDesc3 = Field.fillLowValue(30);

						@Getter @Setter private char[] msdStkDesc3 = Field.fillLowValue(30);
			@Getter @Setter private List<Bdms01CallParametersArray1> bdms01CallParametersArray1 = new ArrayList<>();
    	

	
	/**
	* Constructor for Bdms01DescSegData
	**/
    public Bdms01DescSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01DescSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01DescSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01DescSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01DescSegSqlcd(0);
         setMsdSecurityDesc2(CONSTANTS.SPACE_30);
         setMsdSecurityDesc3(CONSTANTS.SPACE_30);
     if (bdms01CallParametersArray1.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE;index++) {
              Bdms01CallParametersArray1  newElement = new Bdms01CallParametersArray1(this,beginBdms01CallParametersArray1 + index * Bdms01CallParametersArray1.getBdms01CallParametersArray1FieldLength());
              newElement.initialize();
              getBdms01CallParametersArray1().add(newElement);
          }
     } else {
        if (bdms01CallParametersArray1.size() < BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE) {
          // prefill it first
          for (int index = bdms01CallParametersArray1.size();index <  BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE;index++) {
              Bdms01CallParametersArray1  newElement = new Bdms01CallParametersArray1(this,beginBdms01CallParametersArray1 + index * Bdms01CallParametersArray1.getBdms01CallParametersArray1FieldLength());
              getBdms01CallParametersArray1().add(newElement);
          }
        }
        
     	for (int index = 0;index <  BDMS_01_CALL_PARAMETERS_ARRAY_1_SIZE;index++) {
     		Bdms01CallParametersArray1 bdms01CallParametersArray1Var = bdms01CallParametersArray1.get(index);
 			if (bdms01CallParametersArray1Var == null) {
                bdms01CallParametersArray1Var = new Bdms01CallParametersArray1(this,beginBdms01CallParametersArray1 + index * Bdms01CallParametersArray1.getBdms01CallParametersArray1FieldLength());
                  getBdms01CallParametersArray1().set(index, bdms01CallParametersArray1Var);
			} 
			bdms01CallParametersArray1Var.initialize();
		}
     }
   }


}
  
