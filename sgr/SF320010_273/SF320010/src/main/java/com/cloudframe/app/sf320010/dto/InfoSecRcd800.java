package com.cloudframe.app.sf320010.dto;

/**
*  The class InfoSecRcd800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InfoSecRcd800 extends InfoSecRcd800Serialized {
   
				private RecDate800 recDate800 = new RecDate800();

				private RecTime800 recTime800 = new RecTime800();

						private char[] recClass800 = new char[1];

						private char[] recType800 = new char[1];

						private char[] localMipId800 = new char[3];

						private char[] remMipId800 = new char[3];

						private char[] operId800 = new char[7];

						private char[] message800 = new char[40];

	
	/**
	* Constructor for InfoSecRcd800
	**/
    public InfoSecRcd800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			recDate800.setParent(this,getStartOffset() + 0);
	       			recTime800.setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 10
             ,1
             );
								setRecClass800(fillSpace(1));
								setRecType800(fillSpace(1));
								setLocalMipId800(fillSpace(3));
								setRemMipId800(fillSpace(3));
								setOperId800(fillSpace(7));
								setMessage800(fillSpace(40));
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 74
             ,6
             );
    }


 

	/**
	 *	Returns the value of recDate800
	 *	@return recDate800
	 */   
	 public RecDate800 getRecDate800() {
   	return recDate800;
   }
   /**
	* 	Update RecDate800 with the passed value
	*   Corresponding COBOL Variable is 800-REC-DATE
	*	@param value
	*/
   public void setRecDate800(char[] value) {
      recDate800.setString(value); 
   }   
    
     /**
	 * 	Update RecDate800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRecDate800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,recDate800.begin,recDate800.length());
   }
   
     /**
	 * 	Update RecDate800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,recDate800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RecDate800 with another Field
	 *	@param value
	 */
   public void setRecDate800(Field source) {
   	replace(source,0,source.length(),recDate800.begin,recDate800.length());
   }  
   
     /**
	 * 	Update RecDate800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRecDate800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,recDate800.begin,recDate800.length());
   }
   
     /**
	 * 	Update RecDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,recDate800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of recTime800
	 *	@return recTime800
	 */   
	 public RecTime800 getRecTime800() {
   	return recTime800;
   }
   /**
	* 	Update RecTime800 with the passed value
	*   Corresponding COBOL Variable is 800-REC-TIME
	*	@param value
	*/
   public void setRecTime800(char[] value) {
      recTime800.setString(value); 
   }   
    
     /**
	 * 	Update RecTime800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRecTime800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,recTime800.begin,recTime800.length());
   }
   
     /**
	 * 	Update RecTime800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,recTime800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RecTime800 with another Field
	 *	@param value
	 */
   public void setRecTime800(Field source) {
   	replace(source,0,source.length(),recTime800.begin,recTime800.length());
   }  
   
     /**
	 * 	Update RecTime800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRecTime800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,recTime800.begin,recTime800.length());
   }
   
     /**
	 * 	Update RecTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,recTime800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of recClass800
	 *	@return recClass800
	 */
   public char[] getRecClass800() throws CFException{
     if (isRecClass800Modified()) { 
        recClass800 = refreshRecClass800();
     }
   		return recClass800;
   }

  
	/**
	*  set variable recClass800
	*  Corresponding COBOL Variable is 800-REC-CLASS
	*  @param value
	**/
   public void setRecClass800(char[] value) {
      recClass800 = checkRecClass800Constraints(value);
      serializeRecClass800(recClass800);
   } 

     /**
	 * 	Update RecClass800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecClass800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecClass800,recClass800.length);
   	
   }
   
   public void setRecClass800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecClass800,recClass800.length);
   	
   }
   
     /**
	 * 	Update RecClass800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecClass800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecClass800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecClass800 with another Field
	 *	@param value
	 */
   public void setRecClass800(Field source) {
       replace(source,0,source.length(),beginRecClass800,REC_CLASS_800_LEN);
   	
   }  
   
     /**
	 * 	Update RecClass800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecClass800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecClass800,REC_CLASS_800_LEN);
   	
   }
   
     /**
	 * 	Update RecClass800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecClass800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecClass800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recType800
	 *	@return recType800
	 */
   public char[] getRecType800() throws CFException{
     if (isRecType800Modified()) { 
        recType800 = refreshRecType800();
     }
   		return recType800;
   }

  
	/**
	*  set variable recType800
	*  Corresponding COBOL Variable is 800-REC-TYPE
	*  @param value
	**/
   public void setRecType800(char[] value) {
      recType800 = checkRecType800Constraints(value);
      serializeRecType800(recType800);
   } 

     /**
	 * 	Update RecType800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecType800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecType800,recType800.length);
   	
   }
   
   public void setRecType800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecType800,recType800.length);
   	
   }
   
     /**
	 * 	Update RecType800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecType800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecType800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecType800 with another Field
	 *	@param value
	 */
   public void setRecType800(Field source) {
       replace(source,0,source.length(),beginRecType800,REC_TYPE_800_LEN);
   	
   }  
   
     /**
	 * 	Update RecType800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecType800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecType800,REC_TYPE_800_LEN);
   	
   }
   
     /**
	 * 	Update RecType800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecType800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecType800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of localMipId800
	 *	@return localMipId800
	 */
   public char[] getLocalMipId800() throws CFException{
     if (isLocalMipId800Modified()) { 
        localMipId800 = refreshLocalMipId800();
     }
   		return localMipId800;
   }

  
	/**
	*  set variable localMipId800
	*  Corresponding COBOL Variable is 800-LOCAL-MIP-ID
	*  @param value
	**/
   public void setLocalMipId800(char[] value) {
      localMipId800 = checkLocalMipId800Constraints(value);
      serializeLocalMipId800(localMipId800);
   } 

     /**
	 * 	Update LocalMipId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLocalMipId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLocalMipId800,localMipId800.length);
   	
   }
   
   public void setLocalMipId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLocalMipId800,localMipId800.length);
   	
   }
   
     /**
	 * 	Update LocalMipId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLocalMipId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLocalMipId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LocalMipId800 with another Field
	 *	@param value
	 */
   public void setLocalMipId800(Field source) {
       replace(source,0,source.length(),beginLocalMipId800,LOCAL_MIP_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update LocalMipId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLocalMipId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLocalMipId800,LOCAL_MIP_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update LocalMipId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLocalMipId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLocalMipId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of remMipId800
	 *	@return remMipId800
	 */
   public char[] getRemMipId800() throws CFException{
     if (isRemMipId800Modified()) { 
        remMipId800 = refreshRemMipId800();
     }
   		return remMipId800;
   }

  
	/**
	*  set variable remMipId800
	*  Corresponding COBOL Variable is 800-REM-MIP-ID
	*  @param value
	**/
   public void setRemMipId800(char[] value) {
      remMipId800 = checkRemMipId800Constraints(value);
      serializeRemMipId800(remMipId800);
   } 

     /**
	 * 	Update RemMipId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRemMipId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRemMipId800,remMipId800.length);
   	
   }
   
   public void setRemMipId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRemMipId800,remMipId800.length);
   	
   }
   
     /**
	 * 	Update RemMipId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRemMipId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRemMipId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RemMipId800 with another Field
	 *	@param value
	 */
   public void setRemMipId800(Field source) {
       replace(source,0,source.length(),beginRemMipId800,REM_MIP_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update RemMipId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRemMipId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRemMipId800,REM_MIP_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update RemMipId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRemMipId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRemMipId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of operId800
	 *	@return operId800
	 */
   public char[] getOperId800() throws CFException{
     if (isOperId800Modified()) { 
        operId800 = refreshOperId800();
     }
   		return operId800;
   }

  
	/**
	*  set variable operId800
	*  Corresponding COBOL Variable is 800-OPER-ID
	*  @param value
	**/
   public void setOperId800(char[] value) {
      operId800 = checkOperId800Constraints(value);
      serializeOperId800(operId800);
   } 

     /**
	 * 	Update OperId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOperId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOperId800,operId800.length);
   	
   }
   
   public void setOperId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOperId800,operId800.length);
   	
   }
   
     /**
	 * 	Update OperId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOperId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOperId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OperId800 with another Field
	 *	@param value
	 */
   public void setOperId800(Field source) {
       replace(source,0,source.length(),beginOperId800,OPER_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update OperId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOperId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOperId800,OPER_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update OperId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOperId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOperId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of message800
	 *	@return message800
	 */
   public char[] getMessage800() throws CFException{
     if (isMessage800Modified()) { 
        message800 = refreshMessage800();
     }
   		return message800;
   }

  
	/**
	*  set variable message800
	*  Corresponding COBOL Variable is 800-MESSAGE
	*  @param value
	**/
   public void setMessage800(char[] value) {
      message800 = checkMessage800Constraints(value);
      serializeMessage800(message800);
   } 

     /**
	 * 	Update Message800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessage800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMessage800,message800.length);
   	
   }
   
   public void setMessage800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMessage800,message800.length);
   	
   }
   
     /**
	 * 	Update Message800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessage800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessage800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Message800 with another Field
	 *	@param value
	 */
   public void setMessage800(Field source) {
       replace(source,0,source.length(),beginMessage800,MESSAGE_800_LEN);
   	
   }  
   
     /**
	 * 	Update Message800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessage800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMessage800,MESSAGE_800_LEN);
   	
   }
   
     /**
	 * 	Update Message800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessage800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMessage800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInfoSecRcd800FieldLength() {
			return INFO_SEC_RCD_800_LENGTH;
		}

}
  
