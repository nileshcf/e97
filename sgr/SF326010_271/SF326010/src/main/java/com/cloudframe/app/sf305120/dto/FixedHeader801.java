package com.cloudframe.app.sf305120.dto;

/**
*  The class FixedHeader801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FixedHeader801 extends FixedHeader801Serialized { 
   


								private short mipZLogLnth801;
				private MipZLogClassType801 mipZLogClassType801 = new MipZLogClassType801();

						private char[] mipZLogRefNum801 = new char[6];

						private char[] mipZLogBoxId801 = new char[3];

						private char[] mipZLogTime801 = new char[3];

						private char[] mipZLogDate801 = new char[3];

						private char[] mipZLogEtimeX801 = new char[4];

						private char[] zlogSr1LengthX801 = new char[2];

						private char[] zlogSr2LengthX801 = new char[2];
	
	/**
	* Constructor for FixedHeader801
	**/
    public FixedHeader801() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FixedHeader801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FixedHeader801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			mipZLogClassType801.setParent(this,getStartOffset() + 15);
       replaceValue( // serialize and save the value
             fillLowValue(13)
             , getStartOffset() + 0
             ,13
             );
								setMipZLogLnth801((short)0);
								setMipZLogRefNum801(fillSpace(6));
								setMipZLogBoxId801(fillSpace(3));
								setMipZLogTime801(fillSpace(3));
								setMipZLogDate801(fillSpace(3));
								setMipZLogEtimeX801("0000".toCharArray());
								setZlogSr1LengthX801("00".toCharArray());
								setZlogSr2LengthX801("00".toCharArray());
    } 

	/**
	 *	Returns the value of mipZLogLnth801
	 *	@return mipZLogLnth801
	 */
	public short getMipZLogLnth801() throws CFException {
        if (isMipZLogLnth801Modified()) { 
           mipZLogLnth801 = refreshMipZLogLnth801();
        }
   		return mipZLogLnth801;
	}
	
	/**
	 * 	Update MipZLogLnth801 with the passed value
	 *  Corresponding COBOL Variable is 801-MIP-Z-LOG-LNTH
	 *	@param number
	 */
	public void setMipZLogLnth801(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mipZLogLnth801 = checkMipZLogLnth801MaxLimit(number); 
		serializeMipZLogLnth801(mipZLogLnth801);
	}

	public void setMipZLogLnth801(int number) {
	    number = checkMipZLogLnth801MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMipZLogLnth801((short)number);
	}
	public void setMipZLogLnth801(long number) {
	    number = checkMipZLogLnth801MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMipZLogLnth801((short)number);
	}
	

	/**
	 *	Returns the value of mipZLogClassType801
	 *	@return mipZLogClassType801
	 */   
	 public MipZLogClassType801 getMipZLogClassType801() {
   	return mipZLogClassType801;
   }
   /**
	* 	Update MipZLogClassType801 with the passed value
	*   Corresponding COBOL Variable is 801-MIP-Z-LOG-CLASS-TYPE
	*	@param value
	*/
   public void setMipZLogClassType801(char[] value) {
      mipZLogClassType801.setString(value); 
   }   
    
     /**
	 * 	Update MipZLogClassType801 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMipZLogClassType801(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mipZLogClassType801.begin,mipZLogClassType801.length());
   }
   
     /**
	 * 	Update MipZLogClassType801 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogClassType801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mipZLogClassType801.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MipZLogClassType801 with another Field
	 *	@param value
	 */
   public void setMipZLogClassType801(Field source) {
   	replace(source,0,source.length(),mipZLogClassType801.begin,mipZLogClassType801.length());
   }  
   
     /**
	 * 	Update MipZLogClassType801 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMipZLogClassType801(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mipZLogClassType801.begin,mipZLogClassType801.length());
   }
   
     /**
	 * 	Update MipZLogClassType801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogClassType801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mipZLogClassType801.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mipZLogRefNum801
	 *	@return mipZLogRefNum801
	 */
   public char[] getMipZLogRefNum801() throws CFException{
     if (isMipZLogRefNum801Modified()) { 
        mipZLogRefNum801 = refreshMipZLogRefNum801();
     }
   		return mipZLogRefNum801;
   }

  
	/**
	*  set variable mipZLogRefNum801
	*  Corresponding COBOL Variable is 801-MIP-Z-LOG-REF-NUM
	*  @param value
	**/
   public void setMipZLogRefNum801(char[] value) {
      mipZLogRefNum801 = checkMipZLogRefNum801Constraints(value);
      serializeMipZLogRefNum801(mipZLogRefNum801);
   } 

     /**
	 * 	Update MipZLogRefNum801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogRefNum801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipZLogRefNum801,mipZLogRefNum801.length);
   	
   }
   
   public void setMipZLogRefNum801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogRefNum801,mipZLogRefNum801.length);
   	
   }
   
     /**
	 * 	Update MipZLogRefNum801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogRefNum801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogRefNum801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipZLogRefNum801 with another Field
	 *	@param value
	 */
   public void setMipZLogRefNum801(Field source) {
       replace(source,0,source.length(),beginMipZLogRefNum801,MIP_ZLOG_REF_NUM_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipZLogRefNum801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogRefNum801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipZLogRefNum801,MIP_ZLOG_REF_NUM_801_LEN);
   	
   }
   
     /**
	 * 	Update MipZLogRefNum801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogRefNum801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogRefNum801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mipZLogBoxId801
	 *	@return mipZLogBoxId801
	 */
   public char[] getMipZLogBoxId801() throws CFException{
     if (isMipZLogBoxId801Modified()) { 
        mipZLogBoxId801 = refreshMipZLogBoxId801();
     }
   		return mipZLogBoxId801;
   }

  
	/**
	*  set variable mipZLogBoxId801
	*  Corresponding COBOL Variable is 801-MIP-Z-LOG-BOX-ID
	*  @param value
	**/
   public void setMipZLogBoxId801(char[] value) {
      mipZLogBoxId801 = checkMipZLogBoxId801Constraints(value);
      serializeMipZLogBoxId801(mipZLogBoxId801);
   } 

     /**
	 * 	Update MipZLogBoxId801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogBoxId801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipZLogBoxId801,mipZLogBoxId801.length);
   	
   }
   
   public void setMipZLogBoxId801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogBoxId801,mipZLogBoxId801.length);
   	
   }
   
     /**
	 * 	Update MipZLogBoxId801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogBoxId801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogBoxId801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipZLogBoxId801 with another Field
	 *	@param value
	 */
   public void setMipZLogBoxId801(Field source) {
       replace(source,0,source.length(),beginMipZLogBoxId801,MIP_ZLOG_BOX_ID_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipZLogBoxId801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogBoxId801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipZLogBoxId801,MIP_ZLOG_BOX_ID_801_LEN);
   	
   }
   
     /**
	 * 	Update MipZLogBoxId801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogBoxId801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogBoxId801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mipZLogTime801
	 *	@return mipZLogTime801
	 */
   public char[] getMipZLogTime801() throws CFException{
     if (isMipZLogTime801Modified()) { 
        mipZLogTime801 = refreshMipZLogTime801();
     }
   		return mipZLogTime801;
   }

  
	/**
	*  set variable mipZLogTime801
	*  Corresponding COBOL Variable is 801-MIP-Z-LOG-TIME
	*  @param value
	**/
   public void setMipZLogTime801(char[] value) {
      mipZLogTime801 = checkMipZLogTime801Constraints(value);
      serializeMipZLogTime801(mipZLogTime801);
   } 

     /**
	 * 	Update MipZLogTime801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogTime801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipZLogTime801,mipZLogTime801.length);
   	
   }
   
   public void setMipZLogTime801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogTime801,mipZLogTime801.length);
   	
   }
   
     /**
	 * 	Update MipZLogTime801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogTime801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogTime801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipZLogTime801 with another Field
	 *	@param value
	 */
   public void setMipZLogTime801(Field source) {
       replace(source,0,source.length(),beginMipZLogTime801,MIP_ZLOG_TIME_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipZLogTime801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogTime801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipZLogTime801,MIP_ZLOG_TIME_801_LEN);
   	
   }
   
     /**
	 * 	Update MipZLogTime801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogTime801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogTime801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mipZLogDate801
	 *	@return mipZLogDate801
	 */
   public char[] getMipZLogDate801() throws CFException{
     if (isMipZLogDate801Modified()) { 
        mipZLogDate801 = refreshMipZLogDate801();
     }
   		return mipZLogDate801;
   }

  
	/**
	*  set variable mipZLogDate801
	*  Corresponding COBOL Variable is 801-MIP-Z-LOG-DATE
	*  @param value
	**/
   public void setMipZLogDate801(char[] value) {
      mipZLogDate801 = checkMipZLogDate801Constraints(value);
      serializeMipZLogDate801(mipZLogDate801);
   } 

     /**
	 * 	Update MipZLogDate801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogDate801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipZLogDate801,mipZLogDate801.length);
   	
   }
   
   public void setMipZLogDate801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogDate801,mipZLogDate801.length);
   	
   }
   
     /**
	 * 	Update MipZLogDate801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogDate801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogDate801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipZLogDate801 with another Field
	 *	@param value
	 */
   public void setMipZLogDate801(Field source) {
       replace(source,0,source.length(),beginMipZLogDate801,MIP_ZLOG_DATE_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipZLogDate801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogDate801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipZLogDate801,MIP_ZLOG_DATE_801_LEN);
   	
   }
   
     /**
	 * 	Update MipZLogDate801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogDate801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogDate801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mipZLogEtimeX801
	 *	@return mipZLogEtimeX801
	 */
   public char[] getMipZLogEtimeX801() throws CFException{
     if (isMipZLogEtimeX801Modified()) { 
        mipZLogEtimeX801 = refreshMipZLogEtimeX801();
     }
   		return mipZLogEtimeX801;
   }

  
	/**
	*  set variable mipZLogEtimeX801
	*  Corresponding COBOL Variable is 801-MIP-Z-LOG-ETIME-X
	*  @param value
	**/
   public void setMipZLogEtimeX801(char[] value) {
      mipZLogEtimeX801 = checkMipZLogEtimeX801Constraints(value);
      serializeMipZLogEtimeX801(mipZLogEtimeX801);
   } 

     /**
	 * 	Update MipZLogEtimeX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogEtimeX801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipZLogEtimeX801,mipZLogEtimeX801.length);
   	
   }
   
   public void setMipZLogEtimeX801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogEtimeX801,mipZLogEtimeX801.length);
   	
   }
   
     /**
	 * 	Update MipZLogEtimeX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogEtimeX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogEtimeX801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipZLogEtimeX801 with another Field
	 *	@param value
	 */
   public void setMipZLogEtimeX801(Field source) {
       replace(source,0,source.length(),beginMipZLogEtimeX801,MIP_ZLOG_ETIME_X_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipZLogEtimeX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogEtimeX801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipZLogEtimeX801,MIP_ZLOG_ETIME_X_801_LEN);
   	
   }
   
     /**
	 * 	Update MipZLogEtimeX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogEtimeX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipZLogEtimeX801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of zlogSr1LengthX801
	 *	@return zlogSr1LengthX801
	 */
   public char[] getZlogSr1LengthX801() throws CFException{
     if (isZlogSr1LengthX801Modified()) { 
        zlogSr1LengthX801 = refreshZlogSr1LengthX801();
     }
   		return zlogSr1LengthX801;
   }

  
	/**
	*  set variable zlogSr1LengthX801
	*  Corresponding COBOL Variable is 801-ZLOG-SR1-LENGTH-X
	*  @param value
	**/
   public void setZlogSr1LengthX801(char[] value) {
      zlogSr1LengthX801 = checkZlogSr1LengthX801Constraints(value);
      serializeZlogSr1LengthX801(zlogSr1LengthX801);
   } 

     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginZlogSr1LengthX801,zlogSr1LengthX801.length);
   	
   }
   
   public void setZlogSr1LengthX801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginZlogSr1LengthX801,zlogSr1LengthX801.length);
   	
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogSr1LengthX801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ZlogSr1LengthX801 with another Field
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source) {
       replace(source,0,source.length(),beginZlogSr1LengthX801,ZLOG_SR_1_LENGTH_X_801_LEN);
   	
   }  
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginZlogSr1LengthX801,ZLOG_SR_1_LENGTH_X_801_LEN);
   	
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogSr1LengthX801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of zlogSr2LengthX801
	 *	@return zlogSr2LengthX801
	 */
   public char[] getZlogSr2LengthX801() throws CFException{
     if (isZlogSr2LengthX801Modified()) { 
        zlogSr2LengthX801 = refreshZlogSr2LengthX801();
     }
   		return zlogSr2LengthX801;
   }

  
	/**
	*  set variable zlogSr2LengthX801
	*  Corresponding COBOL Variable is 801-ZLOG-SR2-LENGTH-X
	*  @param value
	**/
   public void setZlogSr2LengthX801(char[] value) {
      zlogSr2LengthX801 = checkZlogSr2LengthX801Constraints(value);
      serializeZlogSr2LengthX801(zlogSr2LengthX801);
   } 

     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogSr2LengthX801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginZlogSr2LengthX801,zlogSr2LengthX801.length);
   	
   }
   
   public void setZlogSr2LengthX801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginZlogSr2LengthX801,zlogSr2LengthX801.length);
   	
   }
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr2LengthX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogSr2LengthX801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ZlogSr2LengthX801 with another Field
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source) {
       replace(source,0,source.length(),beginZlogSr2LengthX801,ZLOG_SR_2_LENGTH_X_801_LEN);
   	
   }  
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginZlogSr2LengthX801,ZLOG_SR_2_LENGTH_X_801_LEN);
   	
   }
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogSr2LengthX801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFixedHeader801FieldLength() {
			return FIXED_HEADER_801_LENGTH;
		}

}
  
