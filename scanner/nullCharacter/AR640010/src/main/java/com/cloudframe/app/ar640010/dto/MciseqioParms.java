package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciseqioParms extends MciseqioParmsSerialized { 
   

						private char[] mciseqioDdname = Field.fillLowValue(8);

								private short mciseqioRequest;

						private char[] mciseqioSysid = Field.fillLowValue(2);

						private char[] mciseqioApplid = Field.fillLowValue(8);

						private char[] mciseqioDsn = new char[44];

						private char[] mciseqioTapser = new char[6];

						private char[] mciseqioVolser = new char[6];

						private char[] mciseqioLabel = new char[2];

						private char[] mciseqioRecfm = new char[2];

								private short mciseqioLrecl;

								private short mciseqioBlksize;
	
	/**
	* Constructor for MciseqioParms
	**/
    public MciseqioParms() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciseqioParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciseqioDsn(fillSpace(44));
								setMciseqioTapser(fillSpace(6));
								setMciseqioVolser(fillSpace(6));
								setMciseqioLabel(fillSpace(2));
								setMciseqioRecfm(fillSpace(2));
								setMciseqioLrecl((short)0);
								setMciseqioBlksize((short)0);
    } 

	/**
	 *	Returns the value of mciseqioDdname
	 *	@return mciseqioDdname
	 */
   public char[] getMciseqioDdname() throws CFException{
     if (isMciseqioDdnameModified()) { 
        mciseqioDdname = refreshMciseqioDdname();
     }
   		return mciseqioDdname;
   }

  
	/**
	*  set variable mciseqioDdname
	*  Corresponding COBOL Variable is MCISEQIO-DDNAME
	*  @param value
	**/
   public void setMciseqioDdname(char[] value) {
      mciseqioDdname = checkMciseqioDdnameConstraints(value);
      serializeMciseqioDdname(mciseqioDdname);
   } 

     /**
	 * 	Update MciseqioDdname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioDdname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioDdname,mciseqioDdname.length);
   	
   }
   
   public void setMciseqioDdname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioDdname,mciseqioDdname.length);
   	
   }
   
     /**
	 * 	Update MciseqioDdname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioDdname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioDdname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioDdname with another Field
	 *	@param value
	 */
   public void setMciseqioDdname(Field source) {
       replace(source,0,source.length(),beginMciseqioDdname,MCISEQIO_DDNAME_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioDdname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioDdname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioDdname,MCISEQIO_DDNAME_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioDdname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioDdname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioDdname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioRequest
	 *	@return mciseqioRequest
	 */
	public short getMciseqioRequest() throws CFException {
        if (isMciseqioRequestModified()) { 
           mciseqioRequest = refreshMciseqioRequest();
        }
   		return mciseqioRequest;
	}
	
	/**
	 * 	Update MciseqioRequest with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-REQUEST
	 *	@param number
	 */
	public void setMciseqioRequest(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioRequest = checkMciseqioRequestMaxLimit(number); 
		serializeMciseqioRequest(mciseqioRequest);
	}

	public void setMciseqioRequest(int number) {
	    number = checkMciseqioRequestMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioRequest((short)number);
	}
	public void setMciseqioRequest(long number) {
	    number = checkMciseqioRequestMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioRequest((short)number);
	}
	

	/**
	 *	Returns the value of mciseqioSysid
	 *	@return mciseqioSysid
	 */
   public char[] getMciseqioSysid() throws CFException{
     if (isMciseqioSysidModified()) { 
        mciseqioSysid = refreshMciseqioSysid();
     }
   		return mciseqioSysid;
   }

  
	/**
	*  set variable mciseqioSysid
	*  Corresponding COBOL Variable is MCISEQIO-SYSID
	*  @param value
	**/
   public void setMciseqioSysid(char[] value) {
      mciseqioSysid = checkMciseqioSysidConstraints(value);
      serializeMciseqioSysid(mciseqioSysid);
   } 

     /**
	 * 	Update MciseqioSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioSysid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioSysid,mciseqioSysid.length);
   	
   }
   
   public void setMciseqioSysid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioSysid,mciseqioSysid.length);
   	
   }
   
     /**
	 * 	Update MciseqioSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioSysid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioSysid with another Field
	 *	@param value
	 */
   public void setMciseqioSysid(Field source) {
       replace(source,0,source.length(),beginMciseqioSysid,MCISEQIO_SYSID_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioSysid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioSysid,MCISEQIO_SYSID_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioSysid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioApplid
	 *	@return mciseqioApplid
	 */
   public char[] getMciseqioApplid() throws CFException{
     if (isMciseqioApplidModified()) { 
        mciseqioApplid = refreshMciseqioApplid();
     }
   		return mciseqioApplid;
   }

  
	/**
	*  set variable mciseqioApplid
	*  Corresponding COBOL Variable is MCISEQIO-APPLID
	*  @param value
	**/
   public void setMciseqioApplid(char[] value) {
      mciseqioApplid = checkMciseqioApplidConstraints(value);
      serializeMciseqioApplid(mciseqioApplid);
   } 

     /**
	 * 	Update MciseqioApplid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioApplid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioApplid,mciseqioApplid.length);
   	
   }
   
   public void setMciseqioApplid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioApplid,mciseqioApplid.length);
   	
   }
   
     /**
	 * 	Update MciseqioApplid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioApplid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioApplid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioApplid with another Field
	 *	@param value
	 */
   public void setMciseqioApplid(Field source) {
       replace(source,0,source.length(),beginMciseqioApplid,MCISEQIO_APPLID_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioApplid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioApplid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioApplid,MCISEQIO_APPLID_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioApplid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioApplid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioApplid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioDsn
	 *	@return mciseqioDsn
	 */
   public char[] getMciseqioDsn() throws CFException{
     if (isMciseqioDsnModified()) { 
        mciseqioDsn = refreshMciseqioDsn();
     }
   		return mciseqioDsn;
   }

  
	/**
	*  set variable mciseqioDsn
	*  Corresponding COBOL Variable is MCISEQIO-DSN
	*  @param value
	**/
   public void setMciseqioDsn(char[] value) {
      mciseqioDsn = checkMciseqioDsnConstraints(value);
      serializeMciseqioDsn(mciseqioDsn);
   } 

     /**
	 * 	Update MciseqioDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioDsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioDsn,mciseqioDsn.length);
   	
   }
   
   public void setMciseqioDsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioDsn,mciseqioDsn.length);
   	
   }
   
     /**
	 * 	Update MciseqioDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioDsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioDsn with another Field
	 *	@param value
	 */
   public void setMciseqioDsn(Field source) {
       replace(source,0,source.length(),beginMciseqioDsn,MCISEQIO_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioDsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioDsn,MCISEQIO_DSN_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioDsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioTapser
	 *	@return mciseqioTapser
	 */
   public char[] getMciseqioTapser() throws CFException{
     if (isMciseqioTapserModified()) { 
        mciseqioTapser = refreshMciseqioTapser();
     }
   		return mciseqioTapser;
   }

  
	/**
	*  set variable mciseqioTapser
	*  Corresponding COBOL Variable is MCISEQIO-TAPSER
	*  @param value
	**/
   public void setMciseqioTapser(char[] value) {
      mciseqioTapser = checkMciseqioTapserConstraints(value);
      serializeMciseqioTapser(mciseqioTapser);
   } 

     /**
	 * 	Update MciseqioTapser 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioTapser(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioTapser,mciseqioTapser.length);
   	
   }
   
   public void setMciseqioTapser(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioTapser,mciseqioTapser.length);
   	
   }
   
     /**
	 * 	Update MciseqioTapser 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioTapser(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioTapser+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioTapser with another Field
	 *	@param value
	 */
   public void setMciseqioTapser(Field source) {
       replace(source,0,source.length(),beginMciseqioTapser,MCISEQIO_TAPSER_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioTapser 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioTapser(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioTapser,MCISEQIO_TAPSER_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioTapser 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioTapser(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioTapser+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioVolser
	 *	@return mciseqioVolser
	 */
   public char[] getMciseqioVolser() throws CFException{
     if (isMciseqioVolserModified()) { 
        mciseqioVolser = refreshMciseqioVolser();
     }
   		return mciseqioVolser;
   }

  
	/**
	*  set variable mciseqioVolser
	*  Corresponding COBOL Variable is MCISEQIO-VOLSER
	*  @param value
	**/
   public void setMciseqioVolser(char[] value) {
      mciseqioVolser = checkMciseqioVolserConstraints(value);
      serializeMciseqioVolser(mciseqioVolser);
   } 

     /**
	 * 	Update MciseqioVolser 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioVolser(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioVolser,mciseqioVolser.length);
   	
   }
   
   public void setMciseqioVolser(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioVolser,mciseqioVolser.length);
   	
   }
   
     /**
	 * 	Update MciseqioVolser 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioVolser(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioVolser+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioVolser with another Field
	 *	@param value
	 */
   public void setMciseqioVolser(Field source) {
       replace(source,0,source.length(),beginMciseqioVolser,MCISEQIO_VOLSER_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioVolser 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioVolser(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioVolser,MCISEQIO_VOLSER_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioVolser 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioVolser(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioVolser+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioLabel
	 *	@return mciseqioLabel
	 */
   public char[] getMciseqioLabel() throws CFException{
     if (isMciseqioLabelModified()) { 
        mciseqioLabel = refreshMciseqioLabel();
     }
   		return mciseqioLabel;
   }

  
	/**
	*  set variable mciseqioLabel
	*  Corresponding COBOL Variable is MCISEQIO-LABEL
	*  @param value
	**/
   public void setMciseqioLabel(char[] value) {
      mciseqioLabel = checkMciseqioLabelConstraints(value);
      serializeMciseqioLabel(mciseqioLabel);
   } 

     /**
	 * 	Update MciseqioLabel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioLabel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioLabel,mciseqioLabel.length);
   	
   }
   
   public void setMciseqioLabel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioLabel,mciseqioLabel.length);
   	
   }
   
     /**
	 * 	Update MciseqioLabel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioLabel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioLabel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioLabel with another Field
	 *	@param value
	 */
   public void setMciseqioLabel(Field source) {
       replace(source,0,source.length(),beginMciseqioLabel,MCISEQIO_LABEL_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioLabel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioLabel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioLabel,MCISEQIO_LABEL_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioLabel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioLabel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioLabel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioRecfm
	 *	@return mciseqioRecfm
	 */
   public char[] getMciseqioRecfm() throws CFException{
     if (isMciseqioRecfmModified()) { 
        mciseqioRecfm = refreshMciseqioRecfm();
     }
   		return mciseqioRecfm;
   }

  
	/**
	*  set variable mciseqioRecfm
	*  Corresponding COBOL Variable is MCISEQIO-RECFM
	*  @param value
	**/
   public void setMciseqioRecfm(char[] value) {
      mciseqioRecfm = checkMciseqioRecfmConstraints(value);
      serializeMciseqioRecfm(mciseqioRecfm);
   } 

     /**
	 * 	Update MciseqioRecfm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioRecfm,mciseqioRecfm.length);
   	
   }
   
   public void setMciseqioRecfm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfm,mciseqioRecfm.length);
   	
   }
   
     /**
	 * 	Update MciseqioRecfm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioRecfm with another Field
	 *	@param value
	 */
   public void setMciseqioRecfm(Field source) {
       replace(source,0,source.length(),beginMciseqioRecfm,MCISEQIO_RECFM_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioRecfm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioRecfm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioRecfm,MCISEQIO_RECFM_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioRecfm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioLrecl
	 *	@return mciseqioLrecl
	 */
	public short getMciseqioLrecl() throws CFException {
        if (isMciseqioLreclModified()) { 
           mciseqioLrecl = refreshMciseqioLrecl();
        }
   		return mciseqioLrecl;
	}
	
	/**
	 * 	Update MciseqioLrecl with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-LRECL
	 *	@param number
	 */
	public void setMciseqioLrecl(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioLrecl = checkMciseqioLreclMaxLimit(number); 
		serializeMciseqioLrecl(mciseqioLrecl);
	}

	public void setMciseqioLrecl(int number) {
	    number = checkMciseqioLreclMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioLrecl((short)number);
	}
	public void setMciseqioLrecl(long number) {
	    number = checkMciseqioLreclMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioLrecl((short)number);
	}
	

	/**
	 *	Returns the value of mciseqioBlksize
	 *	@return mciseqioBlksize
	 */
	public short getMciseqioBlksize() throws CFException {
        if (isMciseqioBlksizeModified()) { 
           mciseqioBlksize = refreshMciseqioBlksize();
        }
   		return mciseqioBlksize;
	}
	
	/**
	 * 	Update MciseqioBlksize with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-BLKSIZE
	 *	@param number
	 */
	public void setMciseqioBlksize(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioBlksize = checkMciseqioBlksizeMaxLimit(number); 
		serializeMciseqioBlksize(mciseqioBlksize);
	}

	public void setMciseqioBlksize(int number) {
	    number = checkMciseqioBlksizeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioBlksize((short)number);
	}
	public void setMciseqioBlksize(long number) {
	    number = checkMciseqioBlksizeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioBlksize((short)number);
	}
	


	
	
	

		public static int getMciseqioParmsFieldLength() {
			return MCISEQIO_PARMS_LENGTH;
		}

}
  
