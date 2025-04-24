package com.cloudframe.app.sf305120.dto;

/**
*  The class CFixedHeader801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CFixedHeader801 extends CFixedHeader801Serialized { 
   


								private short mipCLogLnth801;

						private char[] mipCLogClassType801 = new char[2];

						private char[] mipCLogRefNum801 = new char[6];

						private char[] mipCLogBoxId801 = new char[3];

						private char[] mipCLogTime801 = new char[3];

						private char[] mipCLogDate801 = new char[3];

						private char[] clogHeaderId801 = new char[2];

						private char[] clogHeaderVersion801 = new char[1];

						private char[] clogHeaderLength801 = new char[1];

								private int clogRecordLength801;

						private char[] clogCorrelationId801 = new char[18];

						private char[] clogNumberSvcs801 = new char[1];

						private char[] clogSvcIndent801 = new char[4];

						private char[] clogSvcRqstId801 = new char[6];

						private char[] clogSvcVersion801 = new char[1];

						private char[] clogSvcHdrLnth801 = new char[1];

						private char[] clogSvcStatus801 = new char[1];

						private char[] clogStatusRtnCd801 = new char[1];

								private short clogSvcDataLnth801;
	
	/**
	* Constructor for CFixedHeader801
	**/
    public CFixedHeader801() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CFixedHeader801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CFixedHeader801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillLowValue(13)
             , getStartOffset() + 0
             ,13
             );
								setMipCLogLnth801((short)0);
								setMipCLogClassType801(fillSpace(2));
								setMipCLogRefNum801(fillSpace(6));
								setMipCLogBoxId801(fillSpace(3));
								setMipCLogTime801(fillSpace(3));
								setMipCLogDate801(fillSpace(3));
								setClogHeaderId801(fillSpace(2));
								setClogHeaderVersion801(fillSpace(1));
								setClogHeaderLength801(fillSpace(1));
								setClogRecordLength801(0);
								setClogCorrelationId801(fillSpace(18));
								setClogNumberSvcs801(fillSpace(1));
								setClogSvcIndent801(fillSpace(4));
								setClogSvcRqstId801(fillSpace(6));
								setClogSvcVersion801(fillSpace(1));
								setClogSvcHdrLnth801(fillSpace(1));
								setClogSvcStatus801(fillSpace(1));
								setClogStatusRtnCd801(fillSpace(1));
								setClogSvcDataLnth801((short)0);
    } 

	/**
	 *	Returns the value of mipCLogLnth801
	 *	@return mipCLogLnth801
	 */
	public short getMipCLogLnth801() throws CFException {
        if (isMipCLogLnth801Modified()) { 
           mipCLogLnth801 = refreshMipCLogLnth801();
        }
   		return mipCLogLnth801;
	}
	
	/**
	 * 	Update MipCLogLnth801 with the passed value
	 *  Corresponding COBOL Variable is 801-MIP-C-LOG-LNTH
	 *	@param number
	 */
	public void setMipCLogLnth801(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mipCLogLnth801 = checkMipCLogLnth801MaxLimit(number); 
		serializeMipCLogLnth801(mipCLogLnth801);
	}

	public void setMipCLogLnth801(int number) {
	    number = checkMipCLogLnth801MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMipCLogLnth801((short)number);
	}
	public void setMipCLogLnth801(long number) {
	    number = checkMipCLogLnth801MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMipCLogLnth801((short)number);
	}
	

	/**
	 *	Returns the value of mipCLogClassType801
	 *	@return mipCLogClassType801
	 */
   public char[] getMipCLogClassType801() throws CFException{
     if (isMipCLogClassType801Modified()) { 
        mipCLogClassType801 = refreshMipCLogClassType801();
     }
   		return mipCLogClassType801;
   }

  
	/**
	*  set variable mipCLogClassType801
	*  Corresponding COBOL Variable is 801-MIP-C-LOG-CLASS-TYPE
	*  @param value
	**/
   public void setMipCLogClassType801(char[] value) {
      mipCLogClassType801 = checkMipCLogClassType801Constraints(value);
      serializeMipCLogClassType801(mipCLogClassType801);
   } 

     /**
	 * 	Update MipCLogClassType801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipCLogClassType801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipCLogClassType801,mipCLogClassType801.length);
   	
   }
   
   public void setMipCLogClassType801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogClassType801,mipCLogClassType801.length);
   	
   }
   
     /**
	 * 	Update MipCLogClassType801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogClassType801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogClassType801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipCLogClassType801 with another Field
	 *	@param value
	 */
   public void setMipCLogClassType801(Field source) {
       replace(source,0,source.length(),beginMipCLogClassType801,MIP_CLOG_CLASS_TYPE_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipCLogClassType801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipCLogClassType801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipCLogClassType801,MIP_CLOG_CLASS_TYPE_801_LEN);
   	
   }
   
     /**
	 * 	Update MipCLogClassType801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogClassType801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogClassType801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mipCLogRefNum801
	 *	@return mipCLogRefNum801
	 */
   public char[] getMipCLogRefNum801() throws CFException{
     if (isMipCLogRefNum801Modified()) { 
        mipCLogRefNum801 = refreshMipCLogRefNum801();
     }
   		return mipCLogRefNum801;
   }

  
	/**
	*  set variable mipCLogRefNum801
	*  Corresponding COBOL Variable is 801-MIP-C-LOG-REF-NUM
	*  @param value
	**/
   public void setMipCLogRefNum801(char[] value) {
      mipCLogRefNum801 = checkMipCLogRefNum801Constraints(value);
      serializeMipCLogRefNum801(mipCLogRefNum801);
   } 

     /**
	 * 	Update MipCLogRefNum801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipCLogRefNum801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipCLogRefNum801,mipCLogRefNum801.length);
   	
   }
   
   public void setMipCLogRefNum801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogRefNum801,mipCLogRefNum801.length);
   	
   }
   
     /**
	 * 	Update MipCLogRefNum801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogRefNum801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogRefNum801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipCLogRefNum801 with another Field
	 *	@param value
	 */
   public void setMipCLogRefNum801(Field source) {
       replace(source,0,source.length(),beginMipCLogRefNum801,MIP_CLOG_REF_NUM_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipCLogRefNum801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipCLogRefNum801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipCLogRefNum801,MIP_CLOG_REF_NUM_801_LEN);
   	
   }
   
     /**
	 * 	Update MipCLogRefNum801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogRefNum801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogRefNum801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mipCLogBoxId801
	 *	@return mipCLogBoxId801
	 */
   public char[] getMipCLogBoxId801() throws CFException{
     if (isMipCLogBoxId801Modified()) { 
        mipCLogBoxId801 = refreshMipCLogBoxId801();
     }
   		return mipCLogBoxId801;
   }

  
	/**
	*  set variable mipCLogBoxId801
	*  Corresponding COBOL Variable is 801-MIP-C-LOG-BOX-ID
	*  @param value
	**/
   public void setMipCLogBoxId801(char[] value) {
      mipCLogBoxId801 = checkMipCLogBoxId801Constraints(value);
      serializeMipCLogBoxId801(mipCLogBoxId801);
   } 

     /**
	 * 	Update MipCLogBoxId801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipCLogBoxId801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipCLogBoxId801,mipCLogBoxId801.length);
   	
   }
   
   public void setMipCLogBoxId801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogBoxId801,mipCLogBoxId801.length);
   	
   }
   
     /**
	 * 	Update MipCLogBoxId801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogBoxId801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogBoxId801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipCLogBoxId801 with another Field
	 *	@param value
	 */
   public void setMipCLogBoxId801(Field source) {
       replace(source,0,source.length(),beginMipCLogBoxId801,MIP_CLOG_BOX_ID_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipCLogBoxId801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipCLogBoxId801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipCLogBoxId801,MIP_CLOG_BOX_ID_801_LEN);
   	
   }
   
     /**
	 * 	Update MipCLogBoxId801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogBoxId801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogBoxId801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mipCLogTime801
	 *	@return mipCLogTime801
	 */
   public char[] getMipCLogTime801() throws CFException{
     if (isMipCLogTime801Modified()) { 
        mipCLogTime801 = refreshMipCLogTime801();
     }
   		return mipCLogTime801;
   }

  
	/**
	*  set variable mipCLogTime801
	*  Corresponding COBOL Variable is 801-MIP-C-LOG-TIME
	*  @param value
	**/
   public void setMipCLogTime801(char[] value) {
      mipCLogTime801 = checkMipCLogTime801Constraints(value);
      serializeMipCLogTime801(mipCLogTime801);
   } 

     /**
	 * 	Update MipCLogTime801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipCLogTime801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipCLogTime801,mipCLogTime801.length);
   	
   }
   
   public void setMipCLogTime801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogTime801,mipCLogTime801.length);
   	
   }
   
     /**
	 * 	Update MipCLogTime801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogTime801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogTime801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipCLogTime801 with another Field
	 *	@param value
	 */
   public void setMipCLogTime801(Field source) {
       replace(source,0,source.length(),beginMipCLogTime801,MIP_CLOG_TIME_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipCLogTime801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipCLogTime801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipCLogTime801,MIP_CLOG_TIME_801_LEN);
   	
   }
   
     /**
	 * 	Update MipCLogTime801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogTime801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogTime801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mipCLogDate801
	 *	@return mipCLogDate801
	 */
   public char[] getMipCLogDate801() throws CFException{
     if (isMipCLogDate801Modified()) { 
        mipCLogDate801 = refreshMipCLogDate801();
     }
   		return mipCLogDate801;
   }

  
	/**
	*  set variable mipCLogDate801
	*  Corresponding COBOL Variable is 801-MIP-C-LOG-DATE
	*  @param value
	**/
   public void setMipCLogDate801(char[] value) {
      mipCLogDate801 = checkMipCLogDate801Constraints(value);
      serializeMipCLogDate801(mipCLogDate801);
   } 

     /**
	 * 	Update MipCLogDate801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipCLogDate801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMipCLogDate801,mipCLogDate801.length);
   	
   }
   
   public void setMipCLogDate801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogDate801,mipCLogDate801.length);
   	
   }
   
     /**
	 * 	Update MipCLogDate801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogDate801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogDate801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MipCLogDate801 with another Field
	 *	@param value
	 */
   public void setMipCLogDate801(Field source) {
       replace(source,0,source.length(),beginMipCLogDate801,MIP_CLOG_DATE_801_LEN);
   	
   }  
   
     /**
	 * 	Update MipCLogDate801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipCLogDate801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMipCLogDate801,MIP_CLOG_DATE_801_LEN);
   	
   }
   
     /**
	 * 	Update MipCLogDate801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipCLogDate801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMipCLogDate801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogHeaderId801
	 *	@return clogHeaderId801
	 */
   public char[] getClogHeaderId801() throws CFException{
     if (isClogHeaderId801Modified()) { 
        clogHeaderId801 = refreshClogHeaderId801();
     }
   		return clogHeaderId801;
   }

  
	/**
	*  set variable clogHeaderId801
	*  Corresponding COBOL Variable is 801-CLOG-HEADER-ID
	*  @param value
	**/
   public void setClogHeaderId801(char[] value) {
      clogHeaderId801 = checkClogHeaderId801Constraints(value);
      serializeClogHeaderId801(clogHeaderId801);
   } 

     /**
	 * 	Update ClogHeaderId801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogHeaderId801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogHeaderId801,clogHeaderId801.length);
   	
   }
   
   public void setClogHeaderId801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogHeaderId801,clogHeaderId801.length);
   	
   }
   
     /**
	 * 	Update ClogHeaderId801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogHeaderId801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogHeaderId801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogHeaderId801 with another Field
	 *	@param value
	 */
   public void setClogHeaderId801(Field source) {
       replace(source,0,source.length(),beginClogHeaderId801,CLOG_HEADER_ID_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogHeaderId801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogHeaderId801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogHeaderId801,CLOG_HEADER_ID_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogHeaderId801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogHeaderId801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogHeaderId801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogHeaderVersion801
	 *	@return clogHeaderVersion801
	 */
   public char[] getClogHeaderVersion801() throws CFException{
     if (isClogHeaderVersion801Modified()) { 
        clogHeaderVersion801 = refreshClogHeaderVersion801();
     }
   		return clogHeaderVersion801;
   }

  
	/**
	*  set variable clogHeaderVersion801
	*  Corresponding COBOL Variable is 801-CLOG-HEADER-VERSION
	*  @param value
	**/
   public void setClogHeaderVersion801(char[] value) {
      clogHeaderVersion801 = checkClogHeaderVersion801Constraints(value);
      serializeClogHeaderVersion801(clogHeaderVersion801);
   } 

     /**
	 * 	Update ClogHeaderVersion801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogHeaderVersion801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogHeaderVersion801,clogHeaderVersion801.length);
   	
   }
   
   public void setClogHeaderVersion801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogHeaderVersion801,clogHeaderVersion801.length);
   	
   }
   
     /**
	 * 	Update ClogHeaderVersion801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogHeaderVersion801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogHeaderVersion801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogHeaderVersion801 with another Field
	 *	@param value
	 */
   public void setClogHeaderVersion801(Field source) {
       replace(source,0,source.length(),beginClogHeaderVersion801,CLOG_HEADER_VERSION_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogHeaderVersion801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogHeaderVersion801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogHeaderVersion801,CLOG_HEADER_VERSION_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogHeaderVersion801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogHeaderVersion801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogHeaderVersion801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogHeaderLength801
	 *	@return clogHeaderLength801
	 */
   public char[] getClogHeaderLength801() throws CFException{
     if (isClogHeaderLength801Modified()) { 
        clogHeaderLength801 = refreshClogHeaderLength801();
     }
   		return clogHeaderLength801;
   }

  
	/**
	*  set variable clogHeaderLength801
	*  Corresponding COBOL Variable is 801-CLOG-HEADER-LENGTH
	*  @param value
	**/
   public void setClogHeaderLength801(char[] value) {
      clogHeaderLength801 = checkClogHeaderLength801Constraints(value);
      serializeClogHeaderLength801(clogHeaderLength801);
   } 

     /**
	 * 	Update ClogHeaderLength801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogHeaderLength801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogHeaderLength801,clogHeaderLength801.length);
   	
   }
   
   public void setClogHeaderLength801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogHeaderLength801,clogHeaderLength801.length);
   	
   }
   
     /**
	 * 	Update ClogHeaderLength801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogHeaderLength801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogHeaderLength801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogHeaderLength801 with another Field
	 *	@param value
	 */
   public void setClogHeaderLength801(Field source) {
       replace(source,0,source.length(),beginClogHeaderLength801,CLOG_HEADER_LENGTH_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogHeaderLength801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogHeaderLength801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogHeaderLength801,CLOG_HEADER_LENGTH_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogHeaderLength801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogHeaderLength801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogHeaderLength801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogRecordLength801
	 *	@return clogRecordLength801
	 */
	public int getClogRecordLength801() throws CFException {
        if (isClogRecordLength801Modified()) { 
           clogRecordLength801 = refreshClogRecordLength801();
        }
   		return clogRecordLength801;
	}
	
	/**
	 * 	Update ClogRecordLength801 with the passed value
	 *  Corresponding COBOL Variable is 801-CLOG-RECORD-LENGTH
	 *	@param number
	 */
	public void setClogRecordLength801(int number) {
	     // Truncate if the number is beyond +/- Max range
	    clogRecordLength801 = checkClogRecordLength801MaxLimit(number); 
		serializeClogRecordLength801(clogRecordLength801);
	}


	public void setClogRecordLength801(long number) {
	    number = checkClogRecordLength801MaxLimit(number); // Truncate if value is beyond +/- Max range
		setClogRecordLength801((int)number);
	}
	
	/**
	 *	Returns the value of clogCorrelationId801
	 *	@return clogCorrelationId801
	 */
   public char[] getClogCorrelationId801() throws CFException{
     if (isClogCorrelationId801Modified()) { 
        clogCorrelationId801 = refreshClogCorrelationId801();
     }
   		return clogCorrelationId801;
   }

  
	/**
	*  set variable clogCorrelationId801
	*  Corresponding COBOL Variable is 801-CLOG-CORRELATION-ID
	*  @param value
	**/
   public void setClogCorrelationId801(char[] value) {
      clogCorrelationId801 = checkClogCorrelationId801Constraints(value);
      serializeClogCorrelationId801(clogCorrelationId801);
   } 

     /**
	 * 	Update ClogCorrelationId801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogCorrelationId801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogCorrelationId801,clogCorrelationId801.length);
   	
   }
   
   public void setClogCorrelationId801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogCorrelationId801,clogCorrelationId801.length);
   	
   }
   
     /**
	 * 	Update ClogCorrelationId801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogCorrelationId801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogCorrelationId801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogCorrelationId801 with another Field
	 *	@param value
	 */
   public void setClogCorrelationId801(Field source) {
       replace(source,0,source.length(),beginClogCorrelationId801,CLOG_CORRELATION_ID_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogCorrelationId801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogCorrelationId801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogCorrelationId801,CLOG_CORRELATION_ID_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogCorrelationId801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogCorrelationId801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogCorrelationId801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogNumberSvcs801
	 *	@return clogNumberSvcs801
	 */
   public char[] getClogNumberSvcs801() throws CFException{
     if (isClogNumberSvcs801Modified()) { 
        clogNumberSvcs801 = refreshClogNumberSvcs801();
     }
   		return clogNumberSvcs801;
   }

  
	/**
	*  set variable clogNumberSvcs801
	*  Corresponding COBOL Variable is 801-CLOG-NUMBER-SVCS
	*  @param value
	**/
   public void setClogNumberSvcs801(char[] value) {
      clogNumberSvcs801 = checkClogNumberSvcs801Constraints(value);
      serializeClogNumberSvcs801(clogNumberSvcs801);
   } 

     /**
	 * 	Update ClogNumberSvcs801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogNumberSvcs801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogNumberSvcs801,clogNumberSvcs801.length);
   	
   }
   
   public void setClogNumberSvcs801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogNumberSvcs801,clogNumberSvcs801.length);
   	
   }
   
     /**
	 * 	Update ClogNumberSvcs801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogNumberSvcs801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogNumberSvcs801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogNumberSvcs801 with another Field
	 *	@param value
	 */
   public void setClogNumberSvcs801(Field source) {
       replace(source,0,source.length(),beginClogNumberSvcs801,CLOG_NUMBER_SVCS_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogNumberSvcs801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogNumberSvcs801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogNumberSvcs801,CLOG_NUMBER_SVCS_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogNumberSvcs801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogNumberSvcs801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogNumberSvcs801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogSvcIndent801
	 *	@return clogSvcIndent801
	 */
   public char[] getClogSvcIndent801() throws CFException{
     if (isClogSvcIndent801Modified()) { 
        clogSvcIndent801 = refreshClogSvcIndent801();
     }
   		return clogSvcIndent801;
   }

  
	/**
	*  set variable clogSvcIndent801
	*  Corresponding COBOL Variable is 801-CLOG-SVC-INDENT
	*  @param value
	**/
   public void setClogSvcIndent801(char[] value) {
      clogSvcIndent801 = checkClogSvcIndent801Constraints(value);
      serializeClogSvcIndent801(clogSvcIndent801);
   } 

     /**
	 * 	Update ClogSvcIndent801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogSvcIndent801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogSvcIndent801,clogSvcIndent801.length);
   	
   }
   
   public void setClogSvcIndent801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcIndent801,clogSvcIndent801.length);
   	
   }
   
     /**
	 * 	Update ClogSvcIndent801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcIndent801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcIndent801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogSvcIndent801 with another Field
	 *	@param value
	 */
   public void setClogSvcIndent801(Field source) {
       replace(source,0,source.length(),beginClogSvcIndent801,CLOG_SVC_INDENT_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogSvcIndent801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogSvcIndent801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogSvcIndent801,CLOG_SVC_INDENT_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogSvcIndent801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcIndent801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcIndent801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogSvcRqstId801
	 *	@return clogSvcRqstId801
	 */
   public char[] getClogSvcRqstId801() throws CFException{
     if (isClogSvcRqstId801Modified()) { 
        clogSvcRqstId801 = refreshClogSvcRqstId801();
     }
   		return clogSvcRqstId801;
   }

  
	/**
	*  set variable clogSvcRqstId801
	*  Corresponding COBOL Variable is 801-CLOG-SVC-RQST-ID
	*  @param value
	**/
   public void setClogSvcRqstId801(char[] value) {
      clogSvcRqstId801 = checkClogSvcRqstId801Constraints(value);
      serializeClogSvcRqstId801(clogSvcRqstId801);
   } 

     /**
	 * 	Update ClogSvcRqstId801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogSvcRqstId801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogSvcRqstId801,clogSvcRqstId801.length);
   	
   }
   
   public void setClogSvcRqstId801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcRqstId801,clogSvcRqstId801.length);
   	
   }
   
     /**
	 * 	Update ClogSvcRqstId801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcRqstId801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcRqstId801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogSvcRqstId801 with another Field
	 *	@param value
	 */
   public void setClogSvcRqstId801(Field source) {
       replace(source,0,source.length(),beginClogSvcRqstId801,CLOG_SVC_RQST_ID_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogSvcRqstId801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogSvcRqstId801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogSvcRqstId801,CLOG_SVC_RQST_ID_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogSvcRqstId801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcRqstId801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcRqstId801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogSvcVersion801
	 *	@return clogSvcVersion801
	 */
   public char[] getClogSvcVersion801() throws CFException{
     if (isClogSvcVersion801Modified()) { 
        clogSvcVersion801 = refreshClogSvcVersion801();
     }
   		return clogSvcVersion801;
   }

  
	/**
	*  set variable clogSvcVersion801
	*  Corresponding COBOL Variable is 801-CLOG-SVC-VERSION
	*  @param value
	**/
   public void setClogSvcVersion801(char[] value) {
      clogSvcVersion801 = checkClogSvcVersion801Constraints(value);
      serializeClogSvcVersion801(clogSvcVersion801);
   } 

     /**
	 * 	Update ClogSvcVersion801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogSvcVersion801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogSvcVersion801,clogSvcVersion801.length);
   	
   }
   
   public void setClogSvcVersion801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcVersion801,clogSvcVersion801.length);
   	
   }
   
     /**
	 * 	Update ClogSvcVersion801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcVersion801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcVersion801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogSvcVersion801 with another Field
	 *	@param value
	 */
   public void setClogSvcVersion801(Field source) {
       replace(source,0,source.length(),beginClogSvcVersion801,CLOG_SVC_VERSION_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogSvcVersion801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogSvcVersion801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogSvcVersion801,CLOG_SVC_VERSION_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogSvcVersion801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcVersion801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcVersion801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogSvcHdrLnth801
	 *	@return clogSvcHdrLnth801
	 */
   public char[] getClogSvcHdrLnth801() throws CFException{
     if (isClogSvcHdrLnth801Modified()) { 
        clogSvcHdrLnth801 = refreshClogSvcHdrLnth801();
     }
   		return clogSvcHdrLnth801;
   }

  
	/**
	*  set variable clogSvcHdrLnth801
	*  Corresponding COBOL Variable is 801-CLOG-SVC-HDR-LNTH
	*  @param value
	**/
   public void setClogSvcHdrLnth801(char[] value) {
      clogSvcHdrLnth801 = checkClogSvcHdrLnth801Constraints(value);
      serializeClogSvcHdrLnth801(clogSvcHdrLnth801);
   } 

     /**
	 * 	Update ClogSvcHdrLnth801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogSvcHdrLnth801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogSvcHdrLnth801,clogSvcHdrLnth801.length);
   	
   }
   
   public void setClogSvcHdrLnth801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcHdrLnth801,clogSvcHdrLnth801.length);
   	
   }
   
     /**
	 * 	Update ClogSvcHdrLnth801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcHdrLnth801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcHdrLnth801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogSvcHdrLnth801 with another Field
	 *	@param value
	 */
   public void setClogSvcHdrLnth801(Field source) {
       replace(source,0,source.length(),beginClogSvcHdrLnth801,CLOG_SVC_HDR_LNTH_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogSvcHdrLnth801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogSvcHdrLnth801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogSvcHdrLnth801,CLOG_SVC_HDR_LNTH_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogSvcHdrLnth801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcHdrLnth801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcHdrLnth801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogSvcStatus801
	 *	@return clogSvcStatus801
	 */
   public char[] getClogSvcStatus801() throws CFException{
     if (isClogSvcStatus801Modified()) { 
        clogSvcStatus801 = refreshClogSvcStatus801();
     }
   		return clogSvcStatus801;
   }

  
	/**
	*  set variable clogSvcStatus801
	*  Corresponding COBOL Variable is 801-CLOG-SVC-STATUS
	*  @param value
	**/
   public void setClogSvcStatus801(char[] value) {
      clogSvcStatus801 = checkClogSvcStatus801Constraints(value);
      serializeClogSvcStatus801(clogSvcStatus801);
   } 

     /**
	 * 	Update ClogSvcStatus801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogSvcStatus801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogSvcStatus801,clogSvcStatus801.length);
   	
   }
   
   public void setClogSvcStatus801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcStatus801,clogSvcStatus801.length);
   	
   }
   
     /**
	 * 	Update ClogSvcStatus801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcStatus801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcStatus801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogSvcStatus801 with another Field
	 *	@param value
	 */
   public void setClogSvcStatus801(Field source) {
       replace(source,0,source.length(),beginClogSvcStatus801,CLOG_SVC_STATUS_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogSvcStatus801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogSvcStatus801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogSvcStatus801,CLOG_SVC_STATUS_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogSvcStatus801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogSvcStatus801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogSvcStatus801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogStatusRtnCd801
	 *	@return clogStatusRtnCd801
	 */
   public char[] getClogStatusRtnCd801() throws CFException{
     if (isClogStatusRtnCd801Modified()) { 
        clogStatusRtnCd801 = refreshClogStatusRtnCd801();
     }
   		return clogStatusRtnCd801;
   }

  
	/**
	*  set variable clogStatusRtnCd801
	*  Corresponding COBOL Variable is 801-CLOG-STATUS-RTN-CD
	*  @param value
	**/
   public void setClogStatusRtnCd801(char[] value) {
      clogStatusRtnCd801 = checkClogStatusRtnCd801Constraints(value);
      serializeClogStatusRtnCd801(clogStatusRtnCd801);
   } 

     /**
	 * 	Update ClogStatusRtnCd801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogStatusRtnCd801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogStatusRtnCd801,clogStatusRtnCd801.length);
   	
   }
   
   public void setClogStatusRtnCd801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogStatusRtnCd801,clogStatusRtnCd801.length);
   	
   }
   
     /**
	 * 	Update ClogStatusRtnCd801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogStatusRtnCd801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogStatusRtnCd801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogStatusRtnCd801 with another Field
	 *	@param value
	 */
   public void setClogStatusRtnCd801(Field source) {
       replace(source,0,source.length(),beginClogStatusRtnCd801,CLOG_STATUS_RTN_CD_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogStatusRtnCd801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogStatusRtnCd801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogStatusRtnCd801,CLOG_STATUS_RTN_CD_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogStatusRtnCd801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogStatusRtnCd801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogStatusRtnCd801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clogSvcDataLnth801
	 *	@return clogSvcDataLnth801
	 */
	public short getClogSvcDataLnth801() throws CFException {
        if (isClogSvcDataLnth801Modified()) { 
           clogSvcDataLnth801 = refreshClogSvcDataLnth801();
        }
   		return clogSvcDataLnth801;
	}
	
	/**
	 * 	Update ClogSvcDataLnth801 with the passed value
	 *  Corresponding COBOL Variable is 801-CLOG-SVC-DATA-LNTH
	 *	@param number
	 */
	public void setClogSvcDataLnth801(short number) {
	     // Truncate if the number is beyond +/- Max range
	    clogSvcDataLnth801 = checkClogSvcDataLnth801MaxLimit(number); 
		serializeClogSvcDataLnth801(clogSvcDataLnth801);
	}

	public void setClogSvcDataLnth801(int number) {
	    number = checkClogSvcDataLnth801MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setClogSvcDataLnth801((short)number);
	}
	public void setClogSvcDataLnth801(long number) {
	    number = checkClogSvcDataLnth801MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setClogSvcDataLnth801((short)number);
	}
	


	
	
	

		public static int getCFixedHeader801FieldLength() {
			return C_FIXED_HEADER_801_LENGTH;
		}

}
  
