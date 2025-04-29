package com.cloudframe.app.alltype.dto;

/**
*  The class AGroupWithArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AGroupWithArray extends AGroupWithArraySerialized { 
   
      private List<Short> aBinarySign1; 

      private List<Integer> aBinarySign2; 

      private List<Long> aBinarySign3; 

      private List<Integer> aBinaryUnsign1; 

      private List<Long> aBinaryUnsign2; 

      private List<Long> aBinaryUnsign3; 

      private List<Short> aDisplaySign1; 

      private List<Integer> aDisplaySign2; 

      private List<Long> aDisplaySign3; 

      private List<Integer> aDisplayUnsign1; 

      private List<Long> aDisplayUnsign2; 

      private List<Long> aDisplayUnsign3; 

      private List<Short> aPackedSign1; 

      private List<Integer> aPackedSign2; 

      private List<Long> aPackedSign3; 

      private List<Integer> aPackedUnsign1; 

      private List<Long> aPackedUnsign2; 

      private List<Long> aPackedUnsign3; 

      private List<BigDecimal> aDecBinarySign1; 

      private List<BigDecimal> aDecBinarySign2; 

      private List<BigDecimal> aDecBinarySign3; 

      private List<BigDecimal> aDecBinaryUnsign1; 

      private List<BigDecimal> aDecBinaryUnsign2; 

      private List<BigDecimal> aDecBinaryUnsign3; 

      private List<BigDecimal> aDecDisplaySign1; 

      private List<BigDecimal> aDecDisplaySign2; 

      private List<BigDecimal> aDecDisplaySign3; 

      private List<BigDecimal> aDecDisplayUnsign1; 

      private List<BigDecimal> aDecDisplayUnsign2; 

      private List<BigDecimal> aDecDisplayUnsign3; 

      private List<BigDecimal> aDecPackedSign1; 

      private List<BigDecimal> aDecPackedSign2; 

      private List<BigDecimal> aDecPackedSign3; 

      private List<BigDecimal> aDecPackedUnsign1; 

      private List<BigDecimal> aDecPackedUnsign2; 

      private List<BigDecimal> aDecPackedUnsign3; 

      private List<char[]> aChar; 

      private List<char[]> aCharJustRight; 

      private List<char[]> aCharZero; 

	
	/**
	* Constructor for AGroupWithArray
	**/
    public AGroupWithArray() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AGroupWithArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AGroupWithArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AGroupWithArray
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
            for (int index =0; index < A_BINARY_SIGN_1_SIZE;index++) {
                  setABinarySign1(index,(short)0);
            }
            for (int index =0; index < A_BINARY_SIGN_2_SIZE;index++) {
                        setABinarySign2(index,0);
            }
            for (int index =0; index < A_BINARY_SIGN_3_SIZE;index++) {
                        setABinarySign3(index,0);
            }
            for (int index =0; index < A_BINARY_UNSIGN_1_SIZE;index++) {
                        setABinaryUnsign1(index,0);
            }
            for (int index =0; index < A_BINARY_UNSIGN_2_SIZE;index++) {
                        setABinaryUnsign2(index,0);
            }
            for (int index =0; index < A_BINARY_UNSIGN_3_SIZE;index++) {
                        setABinaryUnsign3(index,0);
            }
            for (int index =0; index < A_DISPLAY_SIGN_1_SIZE;index++) {
                  setADisplaySign1(index,(short)0);
            }
            for (int index =0; index < A_DISPLAY_SIGN_2_SIZE;index++) {
                        setADisplaySign2(index,0);
            }
            for (int index =0; index < A_DISPLAY_SIGN_3_SIZE;index++) {
                        setADisplaySign3(index,0);
            }
            for (int index =0; index < A_DISPLAY_UNSIGN_1_SIZE;index++) {
                        setADisplayUnsign1(index,0);
            }
            for (int index =0; index < A_DISPLAY_UNSIGN_2_SIZE;index++) {
                        setADisplayUnsign2(index,0);
            }
            for (int index =0; index < A_DISPLAY_UNSIGN_3_SIZE;index++) {
                        setADisplayUnsign3(index,0);
            }
            for (int index =0; index < A_PACKED_SIGN_1_SIZE;index++) {
                  setAPackedSign1(index,(short)0);
            }
            for (int index =0; index < A_PACKED_SIGN_2_SIZE;index++) {
                        setAPackedSign2(index,0);
            }
            for (int index =0; index < A_PACKED_SIGN_3_SIZE;index++) {
                        setAPackedSign3(index,0);
            }
            for (int index =0; index < A_PACKED_UNSIGN_1_SIZE;index++) {
                        setAPackedUnsign1(index,0);
            }
            for (int index =0; index < A_PACKED_UNSIGN_2_SIZE;index++) {
                        setAPackedUnsign2(index,0);
            }
            for (int index =0; index < A_PACKED_UNSIGN_3_SIZE;index++) {
                        setAPackedUnsign3(index,0);
            }
            for (int index =0; index < A_DEC_BINARY_SIGN_1_SIZE;index++) {
             setADecBinarySign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_SIGN_2_SIZE;index++) {
             setADecBinarySign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_SIGN_3_SIZE;index++) {
             setADecBinarySign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_UNSIGN_1_SIZE;index++) {
             setADecBinaryUnsign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_UNSIGN_2_SIZE;index++) {
             setADecBinaryUnsign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_UNSIGN_3_SIZE;index++) {
             setADecBinaryUnsign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_SIGN_1_SIZE;index++) {
             setADecDisplaySign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_SIGN_2_SIZE;index++) {
             setADecDisplaySign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_SIGN_3_SIZE;index++) {
             setADecDisplaySign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_UNSIGN_1_SIZE;index++) {
             setADecDisplayUnsign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_UNSIGN_2_SIZE;index++) {
             setADecDisplayUnsign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_UNSIGN_3_SIZE;index++) {
             setADecDisplayUnsign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_SIGN_1_SIZE;index++) {
             setADecPackedSign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_SIGN_2_SIZE;index++) {
             setADecPackedSign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_SIGN_3_SIZE;index++) {
             setADecPackedSign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_UNSIGN_1_SIZE;index++) {
             setADecPackedUnsign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_UNSIGN_2_SIZE;index++) {
             setADecPackedUnsign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_UNSIGN_3_SIZE;index++) {
             setADecPackedUnsign3(index, BigDecimal.ZERO);
            }
         for (int index =0; index < A_CHAR_SIZE;index++) {
             setAChar(index, CONSTANTS.SPACE_5);
         }
         for (int index =0; index < A_CHAR_JUST_RIGHT_SIZE;index++) {
             setACharJustRight(index, CONSTANTS.SPACE_5);
         }
            for (int index =0; index < A_CHAR_ZERO_SIZE;index++) {
                     setACharZero(index,fillSpace(5));
            }
   }


}
  
