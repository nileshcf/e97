package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioRecfmCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciseqioRecfmCodes extends MciseqioRecfmCodesSerialized { 
   

						private char[] mciseqioRecfmOnDd = new char[2];

						private char[] mciseqioRecfmU = new char[2];

						private char[] mciseqioRecfmF = new char[2];

						private char[] mciseqioRecfmFb = new char[2];

						private char[] mciseqioRecfmFs = new char[2];

						private char[] mciseqioRecfmV = new char[2];

						private char[] mciseqioRecfmVb = new char[2];

						private char[] mciseqioRecfmVs = new char[2];
	
	/**
	* Constructor for MciseqioRecfmCodes
	**/
    public MciseqioRecfmCodes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciseqioRecfmCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioRecfmCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciseqioRecfmOnDd(fillSpace(2));
								setMciseqioRecfmU(("U ").toCharArray());
								setMciseqioRecfmF(("F ").toCharArray());
								setMciseqioRecfmFb(("FB").toCharArray());
								setMciseqioRecfmFs(("FS").toCharArray());
								setMciseqioRecfmV(("V ").toCharArray());
								setMciseqioRecfmVb(("VB").toCharArray());
								setMciseqioRecfmVs(("VS").toCharArray());
    } 

	/**
	 *	Returns the value of mciseqioRecfmOnDd
	 *	@return mciseqioRecfmOnDd
	 */
   public char[] getMciseqioRecfmOnDd() throws CFException{
     if (isMciseqioRecfmOnDdModified()) { 
        mciseqioRecfmOnDd = refreshMciseqioRecfmOnDd();
     }
   		return mciseqioRecfmOnDd;
   }

  
	/**
	*  set variable mciseqioRecfmOnDd
	*  Corresponding COBOL Variable is MCISEQIO-RECFM-ON-DD
	*  @param value
	**/
   public void setMciseqioRecfmOnDd(char[] value) {
      mciseqioRecfmOnDd = checkMciseqioRecfmOnDdConstraints(value);
      serializeMciseqioRecfmOnDd(mciseqioRecfmOnDd);
   } 

     /**
	 * 	Update MciseqioRecfmOnDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmOnDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioRecfmOnDd,mciseqioRecfmOnDd.length);
   	
   }
   
   public void setMciseqioRecfmOnDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmOnDd,mciseqioRecfmOnDd.length);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmOnDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmOnDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmOnDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioRecfmOnDd with another Field
	 *	@param value
	 */
   public void setMciseqioRecfmOnDd(Field source) {
       replace(source,0,source.length(),beginMciseqioRecfmOnDd,MCISEQIO_RECFM_ON_DD_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioRecfmOnDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioRecfmOnDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioRecfmOnDd,MCISEQIO_RECFM_ON_DD_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmOnDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmOnDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmOnDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioRecfmU
	 *	@return mciseqioRecfmU
	 */
   public char[] getMciseqioRecfmU() throws CFException{
     if (isMciseqioRecfmUModified()) { 
        mciseqioRecfmU = refreshMciseqioRecfmU();
     }
   		return mciseqioRecfmU;
   }

  
	/**
	*  set variable mciseqioRecfmU
	*  Corresponding COBOL Variable is MCISEQIO-RECFM-U
	*  @param value
	**/
   public void setMciseqioRecfmU(char[] value) {
      mciseqioRecfmU = checkMciseqioRecfmUConstraints(value);
      serializeMciseqioRecfmU(mciseqioRecfmU);
   } 

     /**
	 * 	Update MciseqioRecfmU 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmU(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioRecfmU,mciseqioRecfmU.length);
   	
   }
   
   public void setMciseqioRecfmU(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmU,mciseqioRecfmU.length);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmU 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmU(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmU+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioRecfmU with another Field
	 *	@param value
	 */
   public void setMciseqioRecfmU(Field source) {
       replace(source,0,source.length(),beginMciseqioRecfmU,MCISEQIO_RECFM_U_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioRecfmU 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioRecfmU(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioRecfmU,MCISEQIO_RECFM_U_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmU 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmU(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmU+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioRecfmF
	 *	@return mciseqioRecfmF
	 */
   public char[] getMciseqioRecfmF() throws CFException{
     if (isMciseqioRecfmFModified()) { 
        mciseqioRecfmF = refreshMciseqioRecfmF();
     }
   		return mciseqioRecfmF;
   }

  
	/**
	*  set variable mciseqioRecfmF
	*  Corresponding COBOL Variable is MCISEQIO-RECFM-F
	*  @param value
	**/
   public void setMciseqioRecfmF(char[] value) {
      mciseqioRecfmF = checkMciseqioRecfmFConstraints(value);
      serializeMciseqioRecfmF(mciseqioRecfmF);
   } 

     /**
	 * 	Update MciseqioRecfmF 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmF(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioRecfmF,mciseqioRecfmF.length);
   	
   }
   
   public void setMciseqioRecfmF(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmF,mciseqioRecfmF.length);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmF 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmF(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmF+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioRecfmF with another Field
	 *	@param value
	 */
   public void setMciseqioRecfmF(Field source) {
       replace(source,0,source.length(),beginMciseqioRecfmF,MCISEQIO_RECFM_F_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioRecfmF 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioRecfmF(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioRecfmF,MCISEQIO_RECFM_F_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmF 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmF(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmF+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioRecfmFb
	 *	@return mciseqioRecfmFb
	 */
   public char[] getMciseqioRecfmFb() throws CFException{
     if (isMciseqioRecfmFbModified()) { 
        mciseqioRecfmFb = refreshMciseqioRecfmFb();
     }
   		return mciseqioRecfmFb;
   }

  
	/**
	*  set variable mciseqioRecfmFb
	*  Corresponding COBOL Variable is MCISEQIO-RECFM-FB
	*  @param value
	**/
   public void setMciseqioRecfmFb(char[] value) {
      mciseqioRecfmFb = checkMciseqioRecfmFbConstraints(value);
      serializeMciseqioRecfmFb(mciseqioRecfmFb);
   } 

     /**
	 * 	Update MciseqioRecfmFb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmFb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioRecfmFb,mciseqioRecfmFb.length);
   	
   }
   
   public void setMciseqioRecfmFb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmFb,mciseqioRecfmFb.length);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmFb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmFb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmFb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioRecfmFb with another Field
	 *	@param value
	 */
   public void setMciseqioRecfmFb(Field source) {
       replace(source,0,source.length(),beginMciseqioRecfmFb,MCISEQIO_RECFM_FB_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioRecfmFb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioRecfmFb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioRecfmFb,MCISEQIO_RECFM_FB_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmFb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmFb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmFb+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioRecfmFs
	 *	@return mciseqioRecfmFs
	 */
   public char[] getMciseqioRecfmFs() throws CFException{
     if (isMciseqioRecfmFsModified()) { 
        mciseqioRecfmFs = refreshMciseqioRecfmFs();
     }
   		return mciseqioRecfmFs;
   }

  
	/**
	*  set variable mciseqioRecfmFs
	*  Corresponding COBOL Variable is MCISEQIO-RECFM-FS
	*  @param value
	**/
   public void setMciseqioRecfmFs(char[] value) {
      mciseqioRecfmFs = checkMciseqioRecfmFsConstraints(value);
      serializeMciseqioRecfmFs(mciseqioRecfmFs);
   } 

     /**
	 * 	Update MciseqioRecfmFs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmFs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioRecfmFs,mciseqioRecfmFs.length);
   	
   }
   
   public void setMciseqioRecfmFs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmFs,mciseqioRecfmFs.length);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmFs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmFs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmFs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioRecfmFs with another Field
	 *	@param value
	 */
   public void setMciseqioRecfmFs(Field source) {
       replace(source,0,source.length(),beginMciseqioRecfmFs,MCISEQIO_RECFM_FS_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioRecfmFs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioRecfmFs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioRecfmFs,MCISEQIO_RECFM_FS_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmFs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmFs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmFs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioRecfmV
	 *	@return mciseqioRecfmV
	 */
   public char[] getMciseqioRecfmV() throws CFException{
     if (isMciseqioRecfmVModified()) { 
        mciseqioRecfmV = refreshMciseqioRecfmV();
     }
   		return mciseqioRecfmV;
   }

  
	/**
	*  set variable mciseqioRecfmV
	*  Corresponding COBOL Variable is MCISEQIO-RECFM-V
	*  @param value
	**/
   public void setMciseqioRecfmV(char[] value) {
      mciseqioRecfmV = checkMciseqioRecfmVConstraints(value);
      serializeMciseqioRecfmV(mciseqioRecfmV);
   } 

     /**
	 * 	Update MciseqioRecfmV 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmV(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioRecfmV,mciseqioRecfmV.length);
   	
   }
   
   public void setMciseqioRecfmV(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmV,mciseqioRecfmV.length);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmV 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmV(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmV+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioRecfmV with another Field
	 *	@param value
	 */
   public void setMciseqioRecfmV(Field source) {
       replace(source,0,source.length(),beginMciseqioRecfmV,MCISEQIO_RECFM_V_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioRecfmV 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioRecfmV(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioRecfmV,MCISEQIO_RECFM_V_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmV 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmV(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmV+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioRecfmVb
	 *	@return mciseqioRecfmVb
	 */
   public char[] getMciseqioRecfmVb() throws CFException{
     if (isMciseqioRecfmVbModified()) { 
        mciseqioRecfmVb = refreshMciseqioRecfmVb();
     }
   		return mciseqioRecfmVb;
   }

  
	/**
	*  set variable mciseqioRecfmVb
	*  Corresponding COBOL Variable is MCISEQIO-RECFM-VB
	*  @param value
	**/
   public void setMciseqioRecfmVb(char[] value) {
      mciseqioRecfmVb = checkMciseqioRecfmVbConstraints(value);
      serializeMciseqioRecfmVb(mciseqioRecfmVb);
   } 

     /**
	 * 	Update MciseqioRecfmVb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmVb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioRecfmVb,mciseqioRecfmVb.length);
   	
   }
   
   public void setMciseqioRecfmVb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmVb,mciseqioRecfmVb.length);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmVb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmVb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmVb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioRecfmVb with another Field
	 *	@param value
	 */
   public void setMciseqioRecfmVb(Field source) {
       replace(source,0,source.length(),beginMciseqioRecfmVb,MCISEQIO_RECFM_VB_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioRecfmVb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioRecfmVb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioRecfmVb,MCISEQIO_RECFM_VB_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmVb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmVb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmVb+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioRecfmVs
	 *	@return mciseqioRecfmVs
	 */
   public char[] getMciseqioRecfmVs() throws CFException{
     if (isMciseqioRecfmVsModified()) { 
        mciseqioRecfmVs = refreshMciseqioRecfmVs();
     }
   		return mciseqioRecfmVs;
   }

  
	/**
	*  set variable mciseqioRecfmVs
	*  Corresponding COBOL Variable is MCISEQIO-RECFM-VS
	*  @param value
	**/
   public void setMciseqioRecfmVs(char[] value) {
      mciseqioRecfmVs = checkMciseqioRecfmVsConstraints(value);
      serializeMciseqioRecfmVs(mciseqioRecfmVs);
   } 

     /**
	 * 	Update MciseqioRecfmVs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioRecfmVs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioRecfmVs,mciseqioRecfmVs.length);
   	
   }
   
   public void setMciseqioRecfmVs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmVs,mciseqioRecfmVs.length);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmVs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmVs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmVs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioRecfmVs with another Field
	 *	@param value
	 */
   public void setMciseqioRecfmVs(Field source) {
       replace(source,0,source.length(),beginMciseqioRecfmVs,MCISEQIO_RECFM_VS_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioRecfmVs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioRecfmVs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioRecfmVs,MCISEQIO_RECFM_VS_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioRecfmVs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioRecfmVs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioRecfmVs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMciseqioRecfmCodesFieldLength() {
			return MCISEQIO_RECFM_CODES_LENGTH;
		}

}
  
