package com.cloudframe.app.u918test.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.u918test.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import java.math.RoundingMode;


public class Work extends WorkSerialized {
   

								private long src3;

								private int tgt3;

								private long src4;

								private long tgt4;

								private long src5;

								private BigDecimal tgt5 = BigDecimal.ZERO;

								private long src6;

								private long tgt6;

								private long src7;

								private long tgt7;

								private long src8;

								private short tgt8;

								private long src9;

								private int tgt9;

								private long src10;

								private char[] tgt10 = Field.fillLowValue(5);

								private long src11;

						private char[] tgt11 = Field.fillLowValue(10);

								private long src12;

								private BigDecimal tgt12 = BigDecimal.ZERO;

								private long src13;

								private BigDecimal tgt13 = BigDecimal.ZERO;

								private long src14;

								private BigDecimal tgt14 = BigDecimal.ZERO;

								private long src15;

								private BigDecimal tgt15 = BigDecimal.ZERO;

								private long src16;

								private long tgt16;

								private long src17;

								private long tgt17;

								private long src18;

								private int tgt18;

								private long src19;

								private long tgt19;

								private long src20;

								private BigDecimal tgt20 = BigDecimal.ZERO;

								private long src21;

								private long tgt21;

								private long src22;

								private long tgt22;

								private long src23;

								private short tgt23;

								private long src24;

								private int tgt24;

								private long src25;

								private char[] tgt25 = Field.fillLowValue(5);

								private long src26;

						private char[] tgt26 = Field.fillLowValue(10);

								private long src27;

								private BigDecimal tgt27 = BigDecimal.ZERO;

								private long src28;

								private BigDecimal tgt28 = BigDecimal.ZERO;

								private long src29;

								private BigDecimal tgt29 = BigDecimal.ZERO;

								private long src30;

								private BigDecimal tgt30 = BigDecimal.ZERO;

								private long src31;

								private long tgt31;

								private long src32;

								private long tgt32;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of src3
	 *	@return src3
	 */
	public long getSrc3() throws CFException {
   		return src3;
	}
	
	/**
	 * 	Update Src3 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-3
	 *	@param number
	 */
	public void setSrc3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src3 = checkSrc3MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt3
	 *	@return tgt3
	 */
	public int getTgt3() throws CFException {
   		return tgt3;
	}
	
	/**
	 * 	Update Tgt3 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-3
	 *	@param number
	 */
	public void setTgt3(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt3 = checkTgt3MaxLimit(number); 
	}


	public void setTgt3(long number) {
	    number = checkTgt3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTgt3((int)number);
	}
	
	/**
	 *	Returns the value of src4
	 *	@return src4
	 */
	public long getSrc4() throws CFException {
   		return src4;
	}
	
	/**
	 * 	Update Src4 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-4
	 *	@param number
	 */
	public void setSrc4(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src4 = checkSrc4MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt4
	 *	@return tgt4
	 */
	public long getTgt4() throws CFException {
   		return tgt4;
	}
	
	/**
	 * 	Update Tgt4 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-4
	 *	@param number
	 */
	public void setTgt4(long number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt4 = checkTgt4MaxLimit(number); 
	}


	/**
	 *	Returns the value of src5
	 *	@return src5
	 */
	public long getSrc5() throws CFException {
   		return src5;
	}
	
	/**
	 * 	Update Src5 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-5
	 *	@param number
	 */
	public void setSrc5(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src5 = checkSrc5MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt5
	 *	@return tgt5
	 */
	public BigDecimal getTgt5() throws CFException {
   		return tgt5;
	}
	
	
	/**
	 * 	Update Tgt5 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-5
	 *	@param number
	 */
	public void setTgt5(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		tgt5 = number.setScale(4,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of src6
	 *	@return src6
	 */
	public long getSrc6() throws CFException {
   		return src6;
	}
	
	/**
	 * 	Update Src6 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-6
	 *	@param number
	 */
	public void setSrc6(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src6 = checkSrc6MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt6
	 *	@return tgt6
	 */
	public long getTgt6() throws CFException {
   		return tgt6;
	}
	
	/**
	 * 	Update Tgt6 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-6
	 *	@param number
	 */
	public void setTgt6(long number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt6 = checkTgt6MaxLimit(number); 
	}


	/**
	 *	Returns the value of src7
	 *	@return src7
	 */
	public long getSrc7() throws CFException {
   		return src7;
	}
	
	/**
	 * 	Update Src7 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-7
	 *	@param number
	 */
	public void setSrc7(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src7 = checkSrc7MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt7
	 *	@return tgt7
	 */
	public long getTgt7() throws CFException {
   		return tgt7;
	}
	
	/**
	 * 	Update Tgt7 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-7
	 *	@param number
	 */
	public void setTgt7(long number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt7 = checkTgt7MaxLimit(number); 
	}


	/**
	 *	Returns the value of src8
	 *	@return src8
	 */
	public long getSrc8() throws CFException {
   		return src8;
	}
	
	/**
	 * 	Update Src8 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-8
	 *	@param number
	 */
	public void setSrc8(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src8 = checkSrc8MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt8
	 *	@return tgt8
	 */
	public short getTgt8() throws CFException {
   		return tgt8;
	}
	
	/**
	 * 	Update Tgt8 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-8
	 *	@param number
	 */
	public void setTgt8(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt8 = checkTgt8MaxLimit(number); 
	}

	public void setTgt8(int number) {
	    number = checkTgt8MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTgt8((short)number);
	}
	public void setTgt8(long number) {
	    number = checkTgt8MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTgt8((short)number);
	}
	

	/**
	 *	Returns the value of src9
	 *	@return src9
	 */
	public long getSrc9() throws CFException {
   		return src9;
	}
	
	/**
	 * 	Update Src9 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-9
	 *	@param number
	 */
	public void setSrc9(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src9 = checkSrc9MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt9
	 *	@return tgt9
	 */
	public int getTgt9() throws CFException {
   		return tgt9;
	}
	
	/**
	 * 	Update Tgt9 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-9
	 *	@param number
	 */
	public void setTgt9(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt9 = checkTgt9MaxLimit(number); 
	}


	public void setTgt9(long number) {
	    number = checkTgt9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTgt9((int)number);
	}
	
	/**
	 *	Returns the value of src10
	 *	@return src10
	 */
	public long getSrc10() throws CFException {
   		return src10;
	}
	
	/**
	 * 	Update Src10 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-10
	 *	@param number
	 */
	public void setSrc10(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src10 = checkSrc10MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt10
	 *	@return tgt10
	 */
   public char[] getTgt10() throws CFException{
     if (isTgt10Modified()) { 
        tgt10 = refreshTgt10();
     }
   		return tgt10;
   }

  
	/**
	*  set variable tgt10
	*  Corresponding COBOL Variable is WS-TGT-10
	*  @param value
	**/
   public void setTgt10(char[] value) {
      tgt10 = checkTgt10Constraints(value);
      serializeTgt10(tgt10);
   } 

     /**
	 * 	Update Tgt10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTgt10,tgt10.length);
   	
   }
   
   public void setTgt10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTgt10,tgt10.length);
   	
   }
   
     /**
	 * 	Update Tgt10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTgt10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tgt10 with another Field
	 *	@param value
	 */
   public void setTgt10(Field source) {
       replace(source,0,source.length(),beginTgt10,TGT_10_LEN);
   	
   }  
   
     /**
	 * 	Update Tgt10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTgt10,TGT_10_LEN);
   	
   }
   
     /**
	 * 	Update Tgt10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTgt10+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of src11
	 *	@return src11
	 */
	public long getSrc11() throws CFException {
   		return src11;
	}
	
	/**
	 * 	Update Src11 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-11
	 *	@param number
	 */
	public void setSrc11(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src11 = checkSrc11MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt11
	 *	@return tgt11
	 */
   public char[] getTgt11() throws CFException{
   		return tgt11;
   }

  
	/**
	*  set variable tgt11
	*  Corresponding COBOL Variable is WS-TGT-11
	*  @param value
	**/
   public void setTgt11(char[] value) {
       value = checkTgt11Constraints(value);
       arraycopy(value,0,tgt11,0,value.length);
   } 
	public void setTgt11(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tgt11,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of src12
	 *	@return src12
	 */
	public long getSrc12() throws CFException {
   		return src12;
	}
	
	/**
	 * 	Update Src12 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-12
	 *	@param number
	 */
	public void setSrc12(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src12 = checkSrc12MaxLimit(number); 
	}


	public BigDecimal getTgt12() throws CFException {
        if (isTgt12Modified()) { 
           tgt12 = refreshTgt12();
        }
   		return tgt12;
	}

    public char[] getTgt12String() {
          return  tgt12String();
    }
	
	/**
	 * 	Update Tgt12 with the passed number
	 *  Corresponding COBOL Variable is WS-TGT-12
	 *	@param number
	 */
	public void setTgt12(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     tgt12 = checkTgt12MaxLimit(number);
	    serializeTgt12(tgt12);
   }
	/**
	 *	Returns the value of src13
	 *	@return src13
	 */
	public long getSrc13() throws CFException {
   		return src13;
	}
	
	/**
	 * 	Update Src13 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-13
	 *	@param number
	 */
	public void setSrc13(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src13 = checkSrc13MaxLimit(number); 
	}


	public BigDecimal getTgt13() throws CFException {
        if (isTgt13Modified()) { 
           tgt13 = refreshTgt13();
        }
   		return tgt13;
	}

    public char[] getTgt13String() {
          return  tgt13String();
    }
	
	/**
	 * 	Update Tgt13 with the passed number
	 *  Corresponding COBOL Variable is WS-TGT-13
	 *	@param number
	 */
	public void setTgt13(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     tgt13 = checkTgt13MaxLimit(number);
	    serializeTgt13(tgt13);
   }
	/**
	 *	Returns the value of src14
	 *	@return src14
	 */
	public long getSrc14() throws CFException {
   		return src14;
	}
	
	/**
	 * 	Update Src14 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-14
	 *	@param number
	 */
	public void setSrc14(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src14 = checkSrc14MaxLimit(number); 
	}


	public BigDecimal getTgt14() throws CFException {
        if (isTgt14Modified()) { 
           tgt14 = refreshTgt14();
        }
   		return tgt14;
	}

    public char[] getTgt14String() {
          return  tgt14String();
    }
	
	/**
	 * 	Update Tgt14 with the passed number
	 *  Corresponding COBOL Variable is WS-TGT-14
	 *	@param number
	 */
	public void setTgt14(BigDecimal number) {	
     tgt14 = checkTgt14MaxLimit(number);
	    serializeTgt14(tgt14);
   }
	/**
	 *	Returns the value of src15
	 *	@return src15
	 */
	public long getSrc15() throws CFException {
   		return src15;
	}
	
	/**
	 * 	Update Src15 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-15
	 *	@param number
	 */
	public void setSrc15(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src15 = checkSrc15MaxLimit(number); 
	}


	public BigDecimal getTgt15() throws CFException {
        if (isTgt15Modified()) { 
           tgt15 = refreshTgt15();
        }
   		return tgt15;
	}

    public char[] getTgt15String() {
          return  tgt15String();
    }
	
	/**
	 * 	Update Tgt15 with the passed number
	 *  Corresponding COBOL Variable is WS-TGT-15
	 *	@param number
	 */
	public void setTgt15(BigDecimal number) {	
     tgt15 = checkTgt15MaxLimit(number);
	    serializeTgt15(tgt15);
   }
	/**
	 *	Returns the value of src16
	 *	@return src16
	 */
	public long getSrc16() throws CFException {
   		return src16;
	}
	
	/**
	 * 	Update Src16 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-16
	 *	@param number
	 */
	public void setSrc16(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src16 = checkSrc16MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt16
	 *	@return tgt16
	 */
	public long getTgt16() throws CFException {
       if (isTgt16Modified()) { 
           tgt16 = refreshTgt16();
        }
   		return tgt16;
	}
	

	
	   
	/**
	 * 	Update Tgt16 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-16
	 *	@param number
	 */
	public void setTgt16(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tgt16 = checkTgt16MaxLimit(number); 
		serializeTgt16(tgt16);
	}
	

	/**
	 * 	Update Tgt16 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt16(char[] value) throws CFException {
		 tgt16 = serializeTgt16(value);
	}
	/**
	 * 	Update Tgt16 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt16String(char[] value) throws CFException {
		 setTgt16(value);
	}
	/**
	 *	Returns the value of src17
	 *	@return src17
	 */
	public long getSrc17() throws CFException {
   		return src17;
	}
	
	/**
	 * 	Update Src17 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-17
	 *	@param number
	 */
	public void setSrc17(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src17 = checkSrc17MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt17
	 *	@return tgt17
	 */
	public long getTgt17() throws CFException {
       if (isTgt17Modified()) { 
           tgt17 = refreshTgt17();
        }
   		return tgt17;
	}
	

    /**
	 *	Returns the String value of tgt17
	 *	@return tgt17
	 */
	public char[]  getTgt17ActualString() {
	    String value = String.valueOf(tgt17).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Tgt17 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-17
	 *	@param number
	 */
	public void setTgt17(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tgt17 = checkTgt17MaxLimit(number); 
		serializeTgt17(tgt17);
	}
	

	/**
	 * 	Update Tgt17 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt17(char[] value) throws CFException {
		 tgt17 = serializeTgt17(value);
	}
	/**
	 * 	Update Tgt17 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt17String(char[] value) throws CFException {
		 setTgt17(value);
	}
	/**
	 *	Returns the value of src18
	 *	@return src18
	 */
	public long getSrc18() throws CFException {
   		return src18;
	}
	
	/**
	 * 	Update Src18 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-18
	 *	@param number
	 */
	public void setSrc18(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src18 = checkSrc18MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt18
	 *	@return tgt18
	 */
	public int getTgt18() throws CFException {
   		return tgt18;
	}
	
	/**
	 * 	Update Tgt18 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-18
	 *	@param number
	 */
	public void setTgt18(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt18 = checkTgt18MaxLimit(number); 
	}


	public void setTgt18(long number) {
	    number = checkTgt18MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTgt18((int)number);
	}
	
	/**
	 *	Returns the value of src19
	 *	@return src19
	 */
	public long getSrc19() throws CFException {
   		return src19;
	}
	
	/**
	 * 	Update Src19 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-19
	 *	@param number
	 */
	public void setSrc19(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src19 = checkSrc19MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt19
	 *	@return tgt19
	 */
	public long getTgt19() throws CFException {
   		return tgt19;
	}
	
	/**
	 * 	Update Tgt19 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-19
	 *	@param number
	 */
	public void setTgt19(long number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt19 = checkTgt19MaxLimit(number); 
	}


	/**
	 *	Returns the value of src20
	 *	@return src20
	 */
	public long getSrc20() throws CFException {
   		return src20;
	}
	
	/**
	 * 	Update Src20 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-20
	 *	@param number
	 */
	public void setSrc20(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src20 = checkSrc20MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt20
	 *	@return tgt20
	 */
	public BigDecimal getTgt20() throws CFException {
   		return tgt20;
	}
	
	
	/**
	 * 	Update Tgt20 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-20
	 *	@param number
	 */
	public void setTgt20(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		tgt20 = number.setScale(4,RoundingMode.DOWN);
   }
              
	/**
	 *	Returns the value of src21
	 *	@return src21
	 */
	public long getSrc21() throws CFException {
   		return src21;
	}
	
	/**
	 * 	Update Src21 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-21
	 *	@param number
	 */
	public void setSrc21(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src21 = checkSrc21MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt21
	 *	@return tgt21
	 */
	public long getTgt21() throws CFException {
   		return tgt21;
	}
	
	/**
	 * 	Update Tgt21 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-21
	 *	@param number
	 */
	public void setTgt21(long number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt21 = checkTgt21MaxLimit(number); 
	}


	/**
	 *	Returns the value of src22
	 *	@return src22
	 */
	public long getSrc22() throws CFException {
   		return src22;
	}
	
	/**
	 * 	Update Src22 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-22
	 *	@param number
	 */
	public void setSrc22(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src22 = checkSrc22MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt22
	 *	@return tgt22
	 */
	public long getTgt22() throws CFException {
   		return tgt22;
	}
	
	/**
	 * 	Update Tgt22 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-22
	 *	@param number
	 */
	public void setTgt22(long number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt22 = checkTgt22MaxLimit(number); 
	}


	/**
	 *	Returns the value of src23
	 *	@return src23
	 */
	public long getSrc23() throws CFException {
   		return src23;
	}
	
	/**
	 * 	Update Src23 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-23
	 *	@param number
	 */
	public void setSrc23(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src23 = checkSrc23MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt23
	 *	@return tgt23
	 */
	public short getTgt23() throws CFException {
   		return tgt23;
	}
	
	/**
	 * 	Update Tgt23 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-23
	 *	@param number
	 */
	public void setTgt23(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt23 = checkTgt23MaxLimit(number); 
	}

	public void setTgt23(int number) {
	    number = checkTgt23MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTgt23((short)number);
	}
	public void setTgt23(long number) {
	    number = checkTgt23MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTgt23((short)number);
	}
	

	/**
	 *	Returns the value of src24
	 *	@return src24
	 */
	public long getSrc24() throws CFException {
   		return src24;
	}
	
	/**
	 * 	Update Src24 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-24
	 *	@param number
	 */
	public void setSrc24(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src24 = checkSrc24MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt24
	 *	@return tgt24
	 */
	public int getTgt24() throws CFException {
   		return tgt24;
	}
	
	/**
	 * 	Update Tgt24 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-24
	 *	@param number
	 */
	public void setTgt24(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tgt24 = checkTgt24MaxLimit(number); 
	}


	public void setTgt24(long number) {
	    number = checkTgt24MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTgt24((int)number);
	}
	
	/**
	 *	Returns the value of src25
	 *	@return src25
	 */
	public long getSrc25() throws CFException {
   		return src25;
	}
	
	/**
	 * 	Update Src25 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-25
	 *	@param number
	 */
	public void setSrc25(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src25 = checkSrc25MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt25
	 *	@return tgt25
	 */
   public char[] getTgt25() throws CFException{
     if (isTgt25Modified()) { 
        tgt25 = refreshTgt25();
     }
   		return tgt25;
   }

  
	/**
	*  set variable tgt25
	*  Corresponding COBOL Variable is WS-TGT-25
	*  @param value
	**/
   public void setTgt25(char[] value) {
      tgt25 = checkTgt25Constraints(value);
      serializeTgt25(tgt25);
   } 

     /**
	 * 	Update Tgt25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTgt25,tgt25.length);
   	
   }
   
   public void setTgt25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTgt25,tgt25.length);
   	
   }
   
     /**
	 * 	Update Tgt25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTgt25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tgt25 with another Field
	 *	@param value
	 */
   public void setTgt25(Field source) {
       replace(source,0,source.length(),beginTgt25,TGT_25_LEN);
   	
   }  
   
     /**
	 * 	Update Tgt25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTgt25,TGT_25_LEN);
   	
   }
   
     /**
	 * 	Update Tgt25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTgt25+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of src26
	 *	@return src26
	 */
	public long getSrc26() throws CFException {
   		return src26;
	}
	
	/**
	 * 	Update Src26 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-26
	 *	@param number
	 */
	public void setSrc26(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src26 = checkSrc26MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt26
	 *	@return tgt26
	 */
   public char[] getTgt26() throws CFException{
   		return tgt26;
   }

  
	/**
	*  set variable tgt26
	*  Corresponding COBOL Variable is WS-TGT-26
	*  @param value
	**/
   public void setTgt26(char[] value) {
       value = checkTgt26Constraints(value);
       arraycopy(value,0,tgt26,0,value.length);
   } 
	public void setTgt26(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tgt26,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of src27
	 *	@return src27
	 */
	public long getSrc27() throws CFException {
   		return src27;
	}
	
	/**
	 * 	Update Src27 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-27
	 *	@param number
	 */
	public void setSrc27(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src27 = checkSrc27MaxLimit(number); 
	}


	public BigDecimal getTgt27() throws CFException {
        if (isTgt27Modified()) { 
           tgt27 = refreshTgt27();
        }
   		return tgt27;
	}

    public char[] getTgt27String() {
          return  tgt27String();
    }
	
	/**
	 * 	Update Tgt27 with the passed number
	 *  Corresponding COBOL Variable is WS-TGT-27
	 *	@param number
	 */
	public void setTgt27(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     tgt27 = checkTgt27MaxLimit(number);
	    serializeTgt27(tgt27);
   }
	/**
	 *	Returns the value of src28
	 *	@return src28
	 */
	public long getSrc28() throws CFException {
   		return src28;
	}
	
	/**
	 * 	Update Src28 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-28
	 *	@param number
	 */
	public void setSrc28(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src28 = checkSrc28MaxLimit(number); 
	}


	public BigDecimal getTgt28() throws CFException {
        if (isTgt28Modified()) { 
           tgt28 = refreshTgt28();
        }
   		return tgt28;
	}

    public char[] getTgt28String() {
          return  tgt28String();
    }
	
	/**
	 * 	Update Tgt28 with the passed number
	 *  Corresponding COBOL Variable is WS-TGT-28
	 *	@param number
	 */
	public void setTgt28(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     tgt28 = checkTgt28MaxLimit(number);
	    serializeTgt28(tgt28);
   }
	/**
	 *	Returns the value of src29
	 *	@return src29
	 */
	public long getSrc29() throws CFException {
   		return src29;
	}
	
	/**
	 * 	Update Src29 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-29
	 *	@param number
	 */
	public void setSrc29(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src29 = checkSrc29MaxLimit(number); 
	}


	public BigDecimal getTgt29() throws CFException {
        if (isTgt29Modified()) { 
           tgt29 = refreshTgt29();
        }
   		return tgt29;
	}

    public char[] getTgt29String() {
          return  tgt29String();
    }
	
	/**
	 * 	Update Tgt29 with the passed number
	 *  Corresponding COBOL Variable is WS-TGT-29
	 *	@param number
	 */
	public void setTgt29(BigDecimal number) {	
     tgt29 = checkTgt29MaxLimit(number);
	    serializeTgt29(tgt29);
   }
	/**
	 *	Returns the value of src30
	 *	@return src30
	 */
	public long getSrc30() throws CFException {
   		return src30;
	}
	
	/**
	 * 	Update Src30 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-30
	 *	@param number
	 */
	public void setSrc30(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src30 = checkSrc30MaxLimit(number); 
	}


	public BigDecimal getTgt30() throws CFException {
        if (isTgt30Modified()) { 
           tgt30 = refreshTgt30();
        }
   		return tgt30;
	}

    public char[] getTgt30String() {
          return  tgt30String();
    }
	
	/**
	 * 	Update Tgt30 with the passed number
	 *  Corresponding COBOL Variable is WS-TGT-30
	 *	@param number
	 */
	public void setTgt30(BigDecimal number) {	
     tgt30 = checkTgt30MaxLimit(number);
	    serializeTgt30(tgt30);
   }
	/**
	 *	Returns the value of src31
	 *	@return src31
	 */
	public long getSrc31() throws CFException {
   		return src31;
	}
	
	/**
	 * 	Update Src31 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-31
	 *	@param number
	 */
	public void setSrc31(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src31 = checkSrc31MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt31
	 *	@return tgt31
	 */
	public long getTgt31() throws CFException {
       if (isTgt31Modified()) { 
           tgt31 = refreshTgt31();
        }
   		return tgt31;
	}
	

	
	   
	/**
	 * 	Update Tgt31 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-31
	 *	@param number
	 */
	public void setTgt31(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tgt31 = checkTgt31MaxLimit(number); 
		serializeTgt31(tgt31);
	}
	

	/**
	 * 	Update Tgt31 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt31(char[] value) throws CFException {
		 tgt31 = serializeTgt31(value);
	}
	/**
	 * 	Update Tgt31 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt31String(char[] value) throws CFException {
		 setTgt31(value);
	}
	/**
	 *	Returns the value of src32
	 *	@return src32
	 */
	public long getSrc32() throws CFException {
   		return src32;
	}
	
	/**
	 * 	Update Src32 with the passed value
	 *  Corresponding COBOL Variable is WS-SRC-32
	 *	@param number
	 */
	public void setSrc32(long number) {
	     // Truncate if the number is beyond +/- Max range
	    src32 = checkSrc32MaxLimit(number); 
	}


	/**
	 *	Returns the value of tgt32
	 *	@return tgt32
	 */
	public long getTgt32() throws CFException {
       if (isTgt32Modified()) { 
           tgt32 = refreshTgt32();
        }
   		return tgt32;
	}
	

    /**
	 *	Returns the String value of tgt32
	 *	@return tgt32
	 */
	public char[]  getTgt32ActualString() {
	    String value = String.valueOf(tgt32).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Tgt32 with the passed value
	 *  Corresponding COBOL Variable is WS-TGT-32
	 *	@param number
	 */
	public void setTgt32(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tgt32 = checkTgt32MaxLimit(number); 
		serializeTgt32(tgt32);
	}
	

	/**
	 * 	Update Tgt32 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt32(char[] value) throws CFException {
		 tgt32 = serializeTgt32(value);
	}
	/**
	 * 	Update Tgt32 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt32String(char[] value) throws CFException {
		 setTgt32(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
