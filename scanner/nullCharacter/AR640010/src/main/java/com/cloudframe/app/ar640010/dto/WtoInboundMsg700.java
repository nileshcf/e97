package com.cloudframe.app.ar640010.dto;

/**
*  The class WtoInboundMsg700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WtoInboundMsg700 extends WtoInboundMsg700Serialized { 
   

						private char[] wtoIbJobName700 = new char[8];


						private char[] wtoIbBulkId700 = new char[4];


						private char[] wtoIbCyclNum700 = new char[3];


						private char[] wtoIbEndptId700 = new char[7];


						private char[] wtoIbFileDsn700 = new char[44];

	
	/**
	* Constructor for WtoInboundMsg700
	**/
    public WtoInboundMsg700() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWtoIbJobName700(fillSpace(8));
       replaceValue( // serialize and save the value
             (" GFTC320I INBD AVAIL: BULK=").toCharArray()
             , getStartOffset() + 8
             ,27
             );
								setWtoIbBulkId700(fillSpace(4));
       replaceValue( // serialize and save the value
             (" CYCLE=").toCharArray()
             , getStartOffset() + 39
             ,7
             );
								setWtoIbCyclNum700(fillSpace(3));
       replaceValue( // serialize and save the value
             (" APPEPT=").toCharArray()
             , getStartOffset() + 49
             ,8
             );
								setWtoIbEndptId700(fillSpace(7));
       replaceValue( // serialize and save the value
             (" DSN=").toCharArray()
             , getStartOffset() + 64
             ,5
             );
								setWtoIbFileDsn700(fillSpace(44));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 113
             ,2
             );
    }


 

	/**
	 *	Returns the value of wtoIbJobName700
	 *	@return wtoIbJobName700
	 */
   public char[] getWtoIbJobName700() throws CFException{
     if (isWtoIbJobName700Modified()) { 
        wtoIbJobName700 = refreshWtoIbJobName700();
     }
   		return wtoIbJobName700;
   }

  
	/**
	*  set variable wtoIbJobName700
	*  Corresponding COBOL Variable is 700-WTO-IB-JOB-NAME
	*  @param value
	**/
   public void setWtoIbJobName700(char[] value) {
      wtoIbJobName700 = checkWtoIbJobName700Constraints(value);
      serializeWtoIbJobName700(wtoIbJobName700);
   } 

     /**
	 * 	Update WtoIbJobName700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWtoIbJobName700(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWtoIbJobName700,wtoIbJobName700.length);
   	
   }
   
   public void setWtoIbJobName700(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbJobName700,wtoIbJobName700.length);
   	
   }
   
     /**
	 * 	Update WtoIbJobName700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbJobName700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbJobName700+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WtoIbJobName700 with another Field
	 *	@param value
	 */
   public void setWtoIbJobName700(Field source) {
       replace(source,0,source.length(),beginWtoIbJobName700,WTO_IB_JOB_NAME_700_LEN);
   	
   }  
   
     /**
	 * 	Update WtoIbJobName700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWtoIbJobName700(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWtoIbJobName700,WTO_IB_JOB_NAME_700_LEN);
   	
   }
   
     /**
	 * 	Update WtoIbJobName700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbJobName700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbJobName700+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wtoIbBulkId700
	 *	@return wtoIbBulkId700
	 */
   public char[] getWtoIbBulkId700() throws CFException{
     if (isWtoIbBulkId700Modified()) { 
        wtoIbBulkId700 = refreshWtoIbBulkId700();
     }
   		return wtoIbBulkId700;
   }

  
	/**
	*  set variable wtoIbBulkId700
	*  Corresponding COBOL Variable is 700-WTO-IB-BULK-ID
	*  @param value
	**/
   public void setWtoIbBulkId700(char[] value) {
      wtoIbBulkId700 = checkWtoIbBulkId700Constraints(value);
      serializeWtoIbBulkId700(wtoIbBulkId700);
   } 

     /**
	 * 	Update WtoIbBulkId700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWtoIbBulkId700(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWtoIbBulkId700,wtoIbBulkId700.length);
   	
   }
   
   public void setWtoIbBulkId700(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbBulkId700,wtoIbBulkId700.length);
   	
   }
   
     /**
	 * 	Update WtoIbBulkId700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbBulkId700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbBulkId700+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WtoIbBulkId700 with another Field
	 *	@param value
	 */
   public void setWtoIbBulkId700(Field source) {
       replace(source,0,source.length(),beginWtoIbBulkId700,WTO_IB_BULK_ID_700_LEN);
   	
   }  
   
     /**
	 * 	Update WtoIbBulkId700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWtoIbBulkId700(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWtoIbBulkId700,WTO_IB_BULK_ID_700_LEN);
   	
   }
   
     /**
	 * 	Update WtoIbBulkId700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbBulkId700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbBulkId700+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wtoIbCyclNum700
	 *	@return wtoIbCyclNum700
	 */
   public char[] getWtoIbCyclNum700() throws CFException{
     if (isWtoIbCyclNum700Modified()) { 
        wtoIbCyclNum700 = refreshWtoIbCyclNum700();
     }
   		return wtoIbCyclNum700;
   }

  
	/**
	*  set variable wtoIbCyclNum700
	*  Corresponding COBOL Variable is 700-WTO-IB-CYCL-NUM
	*  @param value
	**/
   public void setWtoIbCyclNum700(char[] value) {
      wtoIbCyclNum700 = checkWtoIbCyclNum700Constraints(value);
      serializeWtoIbCyclNum700(wtoIbCyclNum700);
   } 

     /**
	 * 	Update WtoIbCyclNum700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWtoIbCyclNum700(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWtoIbCyclNum700,wtoIbCyclNum700.length);
   	
   }
   
   public void setWtoIbCyclNum700(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbCyclNum700,wtoIbCyclNum700.length);
   	
   }
   
     /**
	 * 	Update WtoIbCyclNum700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbCyclNum700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbCyclNum700+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WtoIbCyclNum700 with another Field
	 *	@param value
	 */
   public void setWtoIbCyclNum700(Field source) {
       replace(source,0,source.length(),beginWtoIbCyclNum700,WTO_IB_CYCL_NUM_700_LEN);
   	
   }  
   
     /**
	 * 	Update WtoIbCyclNum700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWtoIbCyclNum700(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWtoIbCyclNum700,WTO_IB_CYCL_NUM_700_LEN);
   	
   }
   
     /**
	 * 	Update WtoIbCyclNum700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbCyclNum700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbCyclNum700+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wtoIbEndptId700
	 *	@return wtoIbEndptId700
	 */
   public char[] getWtoIbEndptId700() throws CFException{
     if (isWtoIbEndptId700Modified()) { 
        wtoIbEndptId700 = refreshWtoIbEndptId700();
     }
   		return wtoIbEndptId700;
   }

  
	/**
	*  set variable wtoIbEndptId700
	*  Corresponding COBOL Variable is 700-WTO-IB-ENDPT-ID
	*  @param value
	**/
   public void setWtoIbEndptId700(char[] value) {
      wtoIbEndptId700 = checkWtoIbEndptId700Constraints(value);
      serializeWtoIbEndptId700(wtoIbEndptId700);
   } 

     /**
	 * 	Update WtoIbEndptId700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWtoIbEndptId700(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWtoIbEndptId700,wtoIbEndptId700.length);
   	
   }
   
   public void setWtoIbEndptId700(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbEndptId700,wtoIbEndptId700.length);
   	
   }
   
     /**
	 * 	Update WtoIbEndptId700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbEndptId700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbEndptId700+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WtoIbEndptId700 with another Field
	 *	@param value
	 */
   public void setWtoIbEndptId700(Field source) {
       replace(source,0,source.length(),beginWtoIbEndptId700,WTO_IB_ENDPT_ID_700_LEN);
   	
   }  
   
     /**
	 * 	Update WtoIbEndptId700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWtoIbEndptId700(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWtoIbEndptId700,WTO_IB_ENDPT_ID_700_LEN);
   	
   }
   
     /**
	 * 	Update WtoIbEndptId700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbEndptId700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbEndptId700+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wtoIbFileDsn700
	 *	@return wtoIbFileDsn700
	 */
   public char[] getWtoIbFileDsn700() throws CFException{
     if (isWtoIbFileDsn700Modified()) { 
        wtoIbFileDsn700 = refreshWtoIbFileDsn700();
     }
   		return wtoIbFileDsn700;
   }

  
	/**
	*  set variable wtoIbFileDsn700
	*  Corresponding COBOL Variable is 700-WTO-IB-FILE-DSN
	*  @param value
	**/
   public void setWtoIbFileDsn700(char[] value) {
      wtoIbFileDsn700 = checkWtoIbFileDsn700Constraints(value);
      serializeWtoIbFileDsn700(wtoIbFileDsn700);
   } 

     /**
	 * 	Update WtoIbFileDsn700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWtoIbFileDsn700(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWtoIbFileDsn700,wtoIbFileDsn700.length);
   	
   }
   
   public void setWtoIbFileDsn700(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbFileDsn700,wtoIbFileDsn700.length);
   	
   }
   
     /**
	 * 	Update WtoIbFileDsn700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbFileDsn700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbFileDsn700+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WtoIbFileDsn700 with another Field
	 *	@param value
	 */
   public void setWtoIbFileDsn700(Field source) {
       replace(source,0,source.length(),beginWtoIbFileDsn700,WTO_IB_FILE_DSN_700_LEN);
   	
   }  
   
     /**
	 * 	Update WtoIbFileDsn700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWtoIbFileDsn700(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWtoIbFileDsn700,WTO_IB_FILE_DSN_700_LEN);
   	
   }
   
     /**
	 * 	Update WtoIbFileDsn700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWtoIbFileDsn700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWtoIbFileDsn700+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWtoInboundMsg700FieldLength() {
			return WTO_INBOUND_MSG_700_LENGTH;
		}

}
  
