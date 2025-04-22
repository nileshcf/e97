package com.cloudframe.app.asaprnt.dto;

/**
*  The class Trailer1700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/


import com.cloudframe.app.asaprnt.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Trailer1700 extends Trailer1700Serialized {
   



								private char[] t1TotLen700 = Field.fillLowValue(7);

	
	/**
	* Constructor for Trailer1700
	**/
    public Trailer1700() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(16)
             , getStartOffset() + 0
             ,16
             );
       replaceValue( // serialize and save the value
             ("TOTAL MESSAGE LENGTH : ").toCharArray()
             , getStartOffset() + 16
             ,23
             );
       replaceValue( // serialize and save the value
             pad(93," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 46
             ,93
             );
    }


 

	/**
	 *	Returns the value of t1TotLen700
	 *	@return t1TotLen700
	 */
   public char[] getT1TotLen700() throws CFException{
     if (isT1TotLen700Modified()) { 
        t1TotLen700 = refreshT1TotLen700();
     }
   		return t1TotLen700;
   }

  
	/**
	*  set variable t1TotLen700
	*  Corresponding COBOL Variable is 700-T1-TOT-LEN
	*  @param value
	**/
   public void setT1TotLen700(char[] value) {
      t1TotLen700 = checkT1TotLen700Constraints(value);
      serializeT1TotLen700(t1TotLen700);
   } 

     /**
	 * 	Update T1TotLen700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setT1TotLen700(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginT1TotLen700,t1TotLen700.length);
   	
   }
   
   public void setT1TotLen700(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginT1TotLen700,t1TotLen700.length);
   	
   }
   
     /**
	 * 	Update T1TotLen700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setT1TotLen700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginT1TotLen700+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update T1TotLen700 with another Field
	 *	@param value
	 */
   public void setT1TotLen700(Field source) {
       replace(source,0,source.length(),beginT1TotLen700,T_1_TOT_LEN_700_LEN);
   	
   }  
   
     /**
	 * 	Update T1TotLen700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setT1TotLen700(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginT1TotLen700,T_1_TOT_LEN_700_LEN);
   	
   }
   
     /**
	 * 	Update T1TotLen700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setT1TotLen700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginT1TotLen700+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTrailer1700FieldLength() {
			return TRAILER_1700_LENGTH;
		}

}
  
