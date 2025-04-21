package com.cloudframe.app.wm001.dto;

/**
*  The class Hdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:03. using version 5.0.0.256
**/


import com.cloudframe.app.wm001.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Hdr extends HdrSerialized {
   


						private char[] hdrL2 = Field.fillLowValue(35);


								private int hdrCnt;


						private char[] hdrL3 = Field.fillLowValue(35);

	
	/**
	* Constructor for Hdr
	**/
    public Hdr() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("*").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 36
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 39
             ,1
             );
       replaceValue( // serialize and save the value
             ("*").toCharArray()
             , getStartOffset() + 75
             ,1
             );
    }


 

	/**
	 *	Returns the value of hdrL2
	 *	@return hdrL2
	 */
   public char[] getHdrL2() throws CFException{
     if (isHdrL2Modified()) { 
        hdrL2 = refreshHdrL2();
     }
   		return hdrL2;
   }

  
	/**
	*  set variable hdrL2
	*  Corresponding COBOL Variable is WS-HDR-L2
	*  @param value
	**/
   public void setHdrL2(char[] value) {
      hdrL2 = checkHdrL2Constraints(value);
      serializeHdrL2(hdrL2);
   } 

     /**
	 * 	Update HdrL2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHdrL2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHdrL2,hdrL2.length);
   	
   }
   
   public void setHdrL2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHdrL2,hdrL2.length);
   	
   }
   
     /**
	 * 	Update HdrL2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHdrL2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHdrL2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HdrL2 with another Field
	 *	@param value
	 */
   public void setHdrL2(Field source) {
       replace(source,0,source.length(),beginHdrL2,HDR_L_2_LEN);
   	
   }  
   
     /**
	 * 	Update HdrL2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHdrL2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHdrL2,HDR_L_2_LEN);
   	
   }
   
     /**
	 * 	Update HdrL2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHdrL2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHdrL2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hdrCnt
	 *	@return hdrCnt
	 */
	public int getHdrCnt() throws CFException {
       if (isHdrCntModified()) { 
           hdrCnt = refreshHdrCnt();
        }
   		return hdrCnt;
	}
	

	
	   
	/**
	 * 	Update HdrCnt with the passed value
	 *  Corresponding COBOL Variable is WS-HDR-CNT
	 *	@param number
	 */
	public void setHdrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    hdrCnt = checkHdrCntMaxLimit(number); 
		serializeHdrCnt(hdrCnt);
	}
	

	public void setHdrCnt(long number) {
	    number = checkHdrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setHdrCnt((int)number);
	}
	
	/**
	 * 	Update HdrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setHdrCnt(char[] value) throws CFException {
		 hdrCnt = serializeHdrCnt(value);
	}
	/**
	 * 	Update HdrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHdrCntString(char[] value) throws CFException {
		 setHdrCnt(value);
	}
	/**
	 *	Returns the value of hdrL3
	 *	@return hdrL3
	 */
   public char[] getHdrL3() throws CFException{
     if (isHdrL3Modified()) { 
        hdrL3 = refreshHdrL3();
     }
   		return hdrL3;
   }

  
	/**
	*  set variable hdrL3
	*  Corresponding COBOL Variable is WS-HDR-L3
	*  @param value
	**/
   public void setHdrL3(char[] value) {
      hdrL3 = checkHdrL3Constraints(value);
      serializeHdrL3(hdrL3);
   } 

     /**
	 * 	Update HdrL3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHdrL3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHdrL3,hdrL3.length);
   	
   }
   
   public void setHdrL3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHdrL3,hdrL3.length);
   	
   }
   
     /**
	 * 	Update HdrL3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHdrL3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHdrL3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HdrL3 with another Field
	 *	@param value
	 */
   public void setHdrL3(Field source) {
       replace(source,0,source.length(),beginHdrL3,HDR_L_3_LEN);
   	
   }  
   
     /**
	 * 	Update HdrL3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHdrL3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHdrL3,HDR_L_3_LEN);
   	
   }
   
     /**
	 * 	Update HdrL3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHdrL3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHdrL3+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdrFieldLength() {
			return HDR_LENGTH;
		}

}
  
