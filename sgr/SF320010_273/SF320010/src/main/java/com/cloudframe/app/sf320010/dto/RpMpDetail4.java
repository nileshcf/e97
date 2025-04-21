package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpMpDetail4 extends RpMpDetail4Serialized {
   

						private char[] rpMpCc4 = new char[1];


								private char[] rpMpIpq1 = Field.fillLowValue(4);


								private char[] rpMpIpq2 = Field.fillLowValue(4);


								private char[] rpMpIpq3 = Field.fillLowValue(4);


								private char[] rpMpIpq4 = Field.fillLowValue(4);


								private char[] rpMpIpq5 = Field.fillLowValue(4);


								private char[] rpMpIpq6 = Field.fillLowValue(4);


								private char[] rpMpIpq7 = Field.fillLowValue(4);

	
	/**
	* Constructor for RpMpDetail4
	**/
    public RpMpDetail4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc4(fillSpace(1));
       replaceValue( // serialize and save the value
             (" IPQ1 - ").toCharArray()
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             ("   IPQ2 - ").toCharArray()
             , getStartOffset() + 13
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ3 - ").toCharArray()
             , getStartOffset() + 27
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ4 - ").toCharArray()
             , getStartOffset() + 41
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ5 - ").toCharArray()
             , getStartOffset() + 55
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ6 - ").toCharArray()
             , getStartOffset() + 69
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ7 - ").toCharArray()
             , getStartOffset() + 83
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(36)
             , getStartOffset() + 97
             ,36
             );
    }


 

	/**
	 *	Returns the value of rpMpCc4
	 *	@return rpMpCc4
	 */
   public char[] getRpMpCc4() throws CFException{
     if (isRpMpCc4Modified()) { 
        rpMpCc4 = refreshRpMpCc4();
     }
   		return rpMpCc4;
   }

  
	/**
	*  set variable rpMpCc4
	*  Corresponding COBOL Variable is RP-MP-CC-4
	*  @param value
	**/
   public void setRpMpCc4(char[] value) {
      rpMpCc4 = checkRpMpCc4Constraints(value);
      serializeRpMpCc4(rpMpCc4);
   } 

     /**
	 * 	Update RpMpCc4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpCc4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpCc4,rpMpCc4.length);
   	
   }
   
   public void setRpMpCc4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc4,rpMpCc4.length);
   	
   }
   
     /**
	 * 	Update RpMpCc4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpCc4 with another Field
	 *	@param value
	 */
   public void setRpMpCc4(Field source) {
       replace(source,0,source.length(),beginRpMpCc4,RP_MP_CC_4_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpCc4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpCc4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpCc4,RP_MP_CC_4_LEN);
   	
   }
   
     /**
	 * 	Update RpMpCc4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq1
	 *	@return rpMpIpq1
	 */
   public char[] getRpMpIpq1() throws CFException{
     if (isRpMpIpq1Modified()) { 
        rpMpIpq1 = refreshRpMpIpq1();
     }
   		return rpMpIpq1;
   }

  
	/**
	*  set variable rpMpIpq1
	*  Corresponding COBOL Variable is RP-MP-IPQ1
	*  @param value
	**/
   public void setRpMpIpq1(char[] value) {
      rpMpIpq1 = checkRpMpIpq1Constraints(value);
      serializeRpMpIpq1(rpMpIpq1);
   } 

     /**
	 * 	Update RpMpIpq1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq1,rpMpIpq1.length);
   	
   }
   
   public void setRpMpIpq1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq1,rpMpIpq1.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq1 with another Field
	 *	@param value
	 */
   public void setRpMpIpq1(Field source) {
       replace(source,0,source.length(),beginRpMpIpq1,RP_MP_IPQ_1_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq1,RP_MP_IPQ_1_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq2
	 *	@return rpMpIpq2
	 */
   public char[] getRpMpIpq2() throws CFException{
     if (isRpMpIpq2Modified()) { 
        rpMpIpq2 = refreshRpMpIpq2();
     }
   		return rpMpIpq2;
   }

  
	/**
	*  set variable rpMpIpq2
	*  Corresponding COBOL Variable is RP-MP-IPQ2
	*  @param value
	**/
   public void setRpMpIpq2(char[] value) {
      rpMpIpq2 = checkRpMpIpq2Constraints(value);
      serializeRpMpIpq2(rpMpIpq2);
   } 

     /**
	 * 	Update RpMpIpq2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq2,rpMpIpq2.length);
   	
   }
   
   public void setRpMpIpq2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq2,rpMpIpq2.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq2 with another Field
	 *	@param value
	 */
   public void setRpMpIpq2(Field source) {
       replace(source,0,source.length(),beginRpMpIpq2,RP_MP_IPQ_2_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq2,RP_MP_IPQ_2_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq3
	 *	@return rpMpIpq3
	 */
   public char[] getRpMpIpq3() throws CFException{
     if (isRpMpIpq3Modified()) { 
        rpMpIpq3 = refreshRpMpIpq3();
     }
   		return rpMpIpq3;
   }

  
	/**
	*  set variable rpMpIpq3
	*  Corresponding COBOL Variable is RP-MP-IPQ3
	*  @param value
	**/
   public void setRpMpIpq3(char[] value) {
      rpMpIpq3 = checkRpMpIpq3Constraints(value);
      serializeRpMpIpq3(rpMpIpq3);
   } 

     /**
	 * 	Update RpMpIpq3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq3,rpMpIpq3.length);
   	
   }
   
   public void setRpMpIpq3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq3,rpMpIpq3.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq3 with another Field
	 *	@param value
	 */
   public void setRpMpIpq3(Field source) {
       replace(source,0,source.length(),beginRpMpIpq3,RP_MP_IPQ_3_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq3,RP_MP_IPQ_3_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq4
	 *	@return rpMpIpq4
	 */
   public char[] getRpMpIpq4() throws CFException{
     if (isRpMpIpq4Modified()) { 
        rpMpIpq4 = refreshRpMpIpq4();
     }
   		return rpMpIpq4;
   }

  
	/**
	*  set variable rpMpIpq4
	*  Corresponding COBOL Variable is RP-MP-IPQ4
	*  @param value
	**/
   public void setRpMpIpq4(char[] value) {
      rpMpIpq4 = checkRpMpIpq4Constraints(value);
      serializeRpMpIpq4(rpMpIpq4);
   } 

     /**
	 * 	Update RpMpIpq4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq4,rpMpIpq4.length);
   	
   }
   
   public void setRpMpIpq4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq4,rpMpIpq4.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq4 with another Field
	 *	@param value
	 */
   public void setRpMpIpq4(Field source) {
       replace(source,0,source.length(),beginRpMpIpq4,RP_MP_IPQ_4_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq4,RP_MP_IPQ_4_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq5
	 *	@return rpMpIpq5
	 */
   public char[] getRpMpIpq5() throws CFException{
     if (isRpMpIpq5Modified()) { 
        rpMpIpq5 = refreshRpMpIpq5();
     }
   		return rpMpIpq5;
   }

  
	/**
	*  set variable rpMpIpq5
	*  Corresponding COBOL Variable is RP-MP-IPQ5
	*  @param value
	**/
   public void setRpMpIpq5(char[] value) {
      rpMpIpq5 = checkRpMpIpq5Constraints(value);
      serializeRpMpIpq5(rpMpIpq5);
   } 

     /**
	 * 	Update RpMpIpq5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq5,rpMpIpq5.length);
   	
   }
   
   public void setRpMpIpq5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq5,rpMpIpq5.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq5 with another Field
	 *	@param value
	 */
   public void setRpMpIpq5(Field source) {
       replace(source,0,source.length(),beginRpMpIpq5,RP_MP_IPQ_5_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq5,RP_MP_IPQ_5_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq6
	 *	@return rpMpIpq6
	 */
   public char[] getRpMpIpq6() throws CFException{
     if (isRpMpIpq6Modified()) { 
        rpMpIpq6 = refreshRpMpIpq6();
     }
   		return rpMpIpq6;
   }

  
	/**
	*  set variable rpMpIpq6
	*  Corresponding COBOL Variable is RP-MP-IPQ6
	*  @param value
	**/
   public void setRpMpIpq6(char[] value) {
      rpMpIpq6 = checkRpMpIpq6Constraints(value);
      serializeRpMpIpq6(rpMpIpq6);
   } 

     /**
	 * 	Update RpMpIpq6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq6,rpMpIpq6.length);
   	
   }
   
   public void setRpMpIpq6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq6,rpMpIpq6.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq6 with another Field
	 *	@param value
	 */
   public void setRpMpIpq6(Field source) {
       replace(source,0,source.length(),beginRpMpIpq6,RP_MP_IPQ_6_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq6,RP_MP_IPQ_6_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq7
	 *	@return rpMpIpq7
	 */
   public char[] getRpMpIpq7() throws CFException{
     if (isRpMpIpq7Modified()) { 
        rpMpIpq7 = refreshRpMpIpq7();
     }
   		return rpMpIpq7;
   }

  
	/**
	*  set variable rpMpIpq7
	*  Corresponding COBOL Variable is RP-MP-IPQ7
	*  @param value
	**/
   public void setRpMpIpq7(char[] value) {
      rpMpIpq7 = checkRpMpIpq7Constraints(value);
      serializeRpMpIpq7(rpMpIpq7);
   } 

     /**
	 * 	Update RpMpIpq7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq7,rpMpIpq7.length);
   	
   }
   
   public void setRpMpIpq7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq7,rpMpIpq7.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq7 with another Field
	 *	@param value
	 */
   public void setRpMpIpq7(Field source) {
       replace(source,0,source.length(),beginRpMpIpq7,RP_MP_IPQ_7_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq7,RP_MP_IPQ_7_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq7+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpMpDetail4FieldLength() {
			return RP_MP_DETAIL_4_LENGTH;
		}

}
  
