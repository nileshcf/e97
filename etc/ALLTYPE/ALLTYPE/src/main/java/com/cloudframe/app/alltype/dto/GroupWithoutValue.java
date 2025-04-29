package com.cloudframe.app.alltype.dto;

/**
*  The class GroupWithoutValue is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.utility.CFUtil;


@Data
public class GroupWithoutValue extends GroupWithoutValueSerialized { 
   

								@Getter @Setter private short binarySign1;

								@Getter @Setter private int binarySign2;

								@Getter @Setter private long binarySign3;

								@Getter @Setter private int binaryUnsign1;

								@Getter @Setter private long binaryUnsign2;

								@Getter @Setter private long binaryUnsign3;

								@Getter @Setter private short displaySign1;

								@Getter @Setter private int displaySign2;

								@Getter @Setter private long displaySign3;

								@Getter @Setter private int displayUnsign1;

								@Getter @Setter private long displayUnsign2;

								@Getter @Setter private long displayUnsign3;

								@Getter @Setter private short packedSign1;

								@Getter @Setter private int packedSign2;

								@Getter @Setter private long packedSign3;

								@Getter @Setter private int packedUnsign1;

								@Getter @Setter private long packedUnsign2;

								@Getter @Setter private long packedUnsign3;

								@Getter @Setter private BigDecimal decBinarySign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decBinarySign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decBinarySign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decBinaryUnsign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decBinaryUnsign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decBinaryUnsign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decDisplaySign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decDisplaySign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decDisplaySign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decDisplayUnsign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decDisplayUnsign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decDisplayUnsign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decPackedSign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decPackedSign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decPackedSign3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decPackedUnsign1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decPackedUnsign2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal decPackedUnsign3 = BigDecimal.ZERO;

						@Getter @Setter private char[] charWs = Field.fillLowValue(5);

						@Getter @Setter private char[] charJustRight = Field.fillLowValue(5);

								@Getter @Setter private char[] charZero = Field.fillLowValue(5);
	
	/**
	* Constructor for GroupWithoutValue
	**/
    public GroupWithoutValue() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for GroupWithoutValue. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GroupWithoutValue(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes GroupWithoutValue
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setBinarySign1((short)0);
                     setBinarySign2(0);
                     setBinarySign3(0);
                     setBinaryUnsign1(0);
                     setBinaryUnsign2(0);
                     setBinaryUnsign3(0);
         	setDisplaySign1((short)0);
                     setDisplaySign2(0);
                     setDisplaySign3(0);
                     setDisplayUnsign1(0);
                     setDisplayUnsign2(0);
                     setDisplayUnsign3(0);
         	setPackedSign1((short)0);
                     setPackedSign2(0);
                     setPackedSign3(0);
                     setPackedUnsign1(0);
                     setPackedUnsign2(0);
                     setPackedUnsign3(0);
			setDecBinarySign1(BigDecimal.ZERO);
			setDecBinarySign2(BigDecimal.ZERO);
			setDecBinarySign3(BigDecimal.ZERO);
			setDecBinaryUnsign1(BigDecimal.ZERO);
			setDecBinaryUnsign2(BigDecimal.ZERO);
			setDecBinaryUnsign3(BigDecimal.ZERO);
			setDecDisplaySign1(BigDecimal.ZERO);
			setDecDisplaySign2(BigDecimal.ZERO);
			setDecDisplaySign3(BigDecimal.ZERO);
			setDecDisplayUnsign1(BigDecimal.ZERO);
			setDecDisplayUnsign2(BigDecimal.ZERO);
			setDecDisplayUnsign3(BigDecimal.ZERO);
			setDecPackedSign1(BigDecimal.ZERO);
			setDecPackedSign2(BigDecimal.ZERO);
			setDecPackedSign3(BigDecimal.ZERO);
			setDecPackedUnsign1(BigDecimal.ZERO);
			setDecPackedUnsign2(BigDecimal.ZERO);
			setDecPackedUnsign3(BigDecimal.ZERO);
         setCharWs(CONSTANTS.SPACE_5);
         setCharJustRight(CONSTANTS.SPACE_5);
                    setCharZero(CONSTANTS.SPACE_5);
   }


}
  
