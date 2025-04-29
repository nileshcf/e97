package com.cloudframe.app.init1.dto;

/**
*  The class CmnSqlca is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;
import com.cloudframe.app.common.CONSTANTS;
import java.util.ArrayList;


@Data
public class CmnSqlca extends CmnSqlcaSerialized { 
   

						@Getter @Setter private char[] cmncaid = Field.fillLowValue(8);

								@Getter @Setter private int cmncabc;

								@Getter @Setter private int cmncode;

								@Getter @Setter private short cmnerrml;

						@Getter @Setter private char[] cmnerrmc = Field.fillLowValue(70);

						@Getter @Setter private char[] cmnerrp = Field.fillLowValue(8);
      private List<Integer> cmnerrd; 


						@Getter @Setter private char[] cmnwarn = Field.fillLowValue(8);

						@Getter @Setter private char[] cmnext = Field.fillLowValue(8);
	
	/**
	* Constructor for CmnSqlca
	**/
    public CmnSqlca() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnSqlca. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnSqlca(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes CmnSqlca
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCmncaid(CONSTANTS.SPACE_8);
                     setCmncabc(0);
                     setCmncode(0);
         	setCmnerrml((short)0);
         setCmnerrmc(CONSTANTS.SPACE_70);
         setCmnerrp(CONSTANTS.SPACE_8);
            for (int index =0; index < CMNERRD_SIZE;index++) {
                        setCmnerrd(index,0);
            }
         setCmnwarn(CONSTANTS.SPACE_8);
         setCmnext(CONSTANTS.SPACE_8);
   }


}
  
