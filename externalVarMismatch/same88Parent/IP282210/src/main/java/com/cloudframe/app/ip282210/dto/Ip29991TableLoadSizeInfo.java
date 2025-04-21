package com.cloudframe.app.ip282210.dto;

/**
*  The class Ip29991TableLoadSizeInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.ip282210.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip29991TableLoadSizeInfo extends Ip29991TableLoadSizeInfoSerialized {
   

						private char[] ip29991LoadSearchPgm = Field.fillLowValue(8);


						private char[] ip29991TableId = Field.fillLowValue(8);


						private char[] ip29991FillerText = new char[21];

								private long ip29991TableRowsLoaded;

						private char[] ip29991FillerText01 = new char[20];

								private long ip29991TableRowOccurs;


						private char[] ip29991TableName = Field.fillLowValue(35);
	
	/**
	* Constructor for Ip29991TableLoadSizeInfo
	**/
    public Ip29991TableLoadSizeInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 8
             ,1
             );
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 17
             ,1
             );
								setIp29991FillerText((" :TABLE ROWS LOADED= ").toCharArray());
								setIp29991FillerText01((" :LOAD AREA OCCURS= ").toCharArray());
       replaceValue( // serialize and save the value
             (": ").toCharArray()
             , getStartOffset() + 75
             ,2
             );
    }


 

	/**
	 *	Returns the value of ip29991LoadSearchPgm
	 *	@return ip29991LoadSearchPgm
	 */
   public char[] getIp29991LoadSearchPgm() throws CFException{
     if (isIp29991LoadSearchPgmModified()) { 
        ip29991LoadSearchPgm = refreshIp29991LoadSearchPgm();
     }
   		return ip29991LoadSearchPgm;
   }

  
	/**
	*  set variable ip29991LoadSearchPgm
	*  Corresponding COBOL Variable is IP29991-LOAD-SEARCH-PGM
	*  @param value
	**/
   public void setIp29991LoadSearchPgm(char[] value) {
      ip29991LoadSearchPgm = checkIp29991LoadSearchPgmConstraints(value);
      serializeIp29991LoadSearchPgm(ip29991LoadSearchPgm);
   } 

     /**
	 * 	Update Ip29991LoadSearchPgm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp29991LoadSearchPgm,ip29991LoadSearchPgm.length);
   	
   }
   
   public void setIp29991LoadSearchPgm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991LoadSearchPgm,ip29991LoadSearchPgm.length);
   	
   }
   
     /**
	 * 	Update Ip29991LoadSearchPgm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991LoadSearchPgm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip29991LoadSearchPgm with another Field
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(Field source) {
       replace(source,0,source.length(),beginIp29991LoadSearchPgm,IP_29991_LOAD_SEARCH_PGM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip29991LoadSearchPgm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp29991LoadSearchPgm,IP_29991_LOAD_SEARCH_PGM_LEN);
   	
   }
   
     /**
	 * 	Update Ip29991LoadSearchPgm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp29991LoadSearchPgm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991LoadSearchPgm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip29991TableId
	 *	@return ip29991TableId
	 */
   public char[] getIp29991TableId() throws CFException{
     if (isIp29991TableIdModified()) { 
        ip29991TableId = refreshIp29991TableId();
     }
   		return ip29991TableId;
   }

  
	/**
	*  set variable ip29991TableId
	*  Corresponding COBOL Variable is IP29991-TABLE-ID
	*  @param value
	**/
   public void setIp29991TableId(char[] value) {
      ip29991TableId = checkIp29991TableIdConstraints(value);
      serializeIp29991TableId(ip29991TableId);
   } 

     /**
	 * 	Update Ip29991TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp29991TableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp29991TableId,ip29991TableId.length);
   	
   }
   
   public void setIp29991TableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991TableId,ip29991TableId.length);
   	
   }
   
     /**
	 * 	Update Ip29991TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp29991TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991TableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip29991TableId with another Field
	 *	@param value
	 */
   public void setIp29991TableId(Field source) {
       replace(source,0,source.length(),beginIp29991TableId,IP_29991_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip29991TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp29991TableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp29991TableId,IP_29991_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip29991TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp29991TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991TableId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip29991FillerText
	 *	@return ip29991FillerText
	 */
   public char[] getIp29991FillerText() throws CFException{
     if (isIp29991FillerTextModified()) { 
        ip29991FillerText = refreshIp29991FillerText();
     }
   		return ip29991FillerText;
   }

  
	/**
	*  set variable ip29991FillerText
	*  Corresponding COBOL Variable is IP29991-FILLER-TEXT
	*  @param value
	**/
   public void setIp29991FillerText(char[] value) {
      ip29991FillerText = checkIp29991FillerTextConstraints(value);
      serializeIp29991FillerText(ip29991FillerText);
   } 

     /**
	 * 	Update Ip29991FillerText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp29991FillerText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp29991FillerText,ip29991FillerText.length);
   	
   }
   
   public void setIp29991FillerText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991FillerText,ip29991FillerText.length);
   	
   }
   
     /**
	 * 	Update Ip29991FillerText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp29991FillerText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991FillerText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip29991FillerText with another Field
	 *	@param value
	 */
   public void setIp29991FillerText(Field source) {
       replace(source,0,source.length(),beginIp29991FillerText,IP_29991_FILLER_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip29991FillerText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp29991FillerText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp29991FillerText,IP_29991_FILLER_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update Ip29991FillerText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp29991FillerText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991FillerText+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip29991TableRowsLoaded
	 *	@return ip29991TableRowsLoaded
	 */
	public long getIp29991TableRowsLoaded() throws CFException {
       if (isIp29991TableRowsLoadedModified()) { 
           ip29991TableRowsLoaded = refreshIp29991TableRowsLoaded();
        }
   		return ip29991TableRowsLoaded;
	}
	

	
	   
	/**
	 * 	Update Ip29991TableRowsLoaded with the passed value
	 *  Corresponding COBOL Variable is IP29991-TABLE-ROWS-LOADED
	 *	@param number
	 */
	public void setIp29991TableRowsLoaded(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip29991TableRowsLoaded = checkIp29991TableRowsLoadedMaxLimit(number); 
		serializeIp29991TableRowsLoaded(ip29991TableRowsLoaded);
	}
	

	/**
	 * 	Update Ip29991TableRowsLoaded with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp29991TableRowsLoaded(char[] value) throws CFException {
		 ip29991TableRowsLoaded = serializeIp29991TableRowsLoaded(value);
	}
	/**
	 * 	Update Ip29991TableRowsLoaded with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp29991TableRowsLoadedString(char[] value) throws CFException {
		 setIp29991TableRowsLoaded(value);
	}
	/**
	 *	Returns the value of ip29991FillerText01
	 *	@return ip29991FillerText01
	 */
   public char[] getIp29991FillerText01() throws CFException{
     if (isIp29991FillerText01Modified()) { 
        ip29991FillerText01 = refreshIp29991FillerText01();
     }
   		return ip29991FillerText01;
   }

  
	/**
	*  set variable ip29991FillerText01
	*  Corresponding COBOL Variable is IP29991-FILLER-TEXT
	*  @param value
	**/
   public void setIp29991FillerText01(char[] value) {
      ip29991FillerText01 = checkIp29991FillerText01Constraints(value);
      serializeIp29991FillerText01(ip29991FillerText01);
   } 

     /**
	 * 	Update Ip29991FillerText01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp29991FillerText01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp29991FillerText01,ip29991FillerText01.length);
   	
   }
   
   public void setIp29991FillerText01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991FillerText01,ip29991FillerText01.length);
   	
   }
   
     /**
	 * 	Update Ip29991FillerText01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp29991FillerText01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991FillerText01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip29991FillerText01 with another Field
	 *	@param value
	 */
   public void setIp29991FillerText01(Field source) {
       replace(source,0,source.length(),beginIp29991FillerText01,IP_29991_FILLER_TEXT_01_LEN);
   	
   }  
   
     /**
	 * 	Update Ip29991FillerText01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp29991FillerText01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp29991FillerText01,IP_29991_FILLER_TEXT_01_LEN);
   	
   }
   
     /**
	 * 	Update Ip29991FillerText01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp29991FillerText01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991FillerText01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip29991TableRowOccurs
	 *	@return ip29991TableRowOccurs
	 */
	public long getIp29991TableRowOccurs() throws CFException {
       if (isIp29991TableRowOccursModified()) { 
           ip29991TableRowOccurs = refreshIp29991TableRowOccurs();
        }
   		return ip29991TableRowOccurs;
	}
	

	
	   
	/**
	 * 	Update Ip29991TableRowOccurs with the passed value
	 *  Corresponding COBOL Variable is IP29991-TABLE-ROW-OCCURS
	 *	@param number
	 */
	public void setIp29991TableRowOccurs(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip29991TableRowOccurs = checkIp29991TableRowOccursMaxLimit(number); 
		serializeIp29991TableRowOccurs(ip29991TableRowOccurs);
	}
	

	/**
	 * 	Update Ip29991TableRowOccurs with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp29991TableRowOccurs(char[] value) throws CFException {
		 ip29991TableRowOccurs = serializeIp29991TableRowOccurs(value);
	}
	/**
	 * 	Update Ip29991TableRowOccurs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp29991TableRowOccursString(char[] value) throws CFException {
		 setIp29991TableRowOccurs(value);
	}
	/**
	 *	Returns the value of ip29991TableName
	 *	@return ip29991TableName
	 */
   public char[] getIp29991TableName() throws CFException{
     if (isIp29991TableNameModified()) { 
        ip29991TableName = refreshIp29991TableName();
     }
   		return ip29991TableName;
   }

  
	/**
	*  set variable ip29991TableName
	*  Corresponding COBOL Variable is IP29991-TABLE-NAME
	*  @param value
	**/
   public void setIp29991TableName(char[] value) {
      ip29991TableName = checkIp29991TableNameConstraints(value);
      serializeIp29991TableName(ip29991TableName);
   } 

     /**
	 * 	Update Ip29991TableName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp29991TableName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp29991TableName,ip29991TableName.length);
   	
   }
   
   public void setIp29991TableName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991TableName,ip29991TableName.length);
   	
   }
   
     /**
	 * 	Update Ip29991TableName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp29991TableName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991TableName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip29991TableName with another Field
	 *	@param value
	 */
   public void setIp29991TableName(Field source) {
       replace(source,0,source.length(),beginIp29991TableName,IP_29991_TABLE_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip29991TableName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp29991TableName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp29991TableName,IP_29991_TABLE_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip29991TableName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp29991TableName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp29991TableName+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp29991TableLoadSizeInfoFieldLength() {
			return IP_29991_TABLE_LOAD_SIZE_INFO_LENGTH;
		}

}
  
