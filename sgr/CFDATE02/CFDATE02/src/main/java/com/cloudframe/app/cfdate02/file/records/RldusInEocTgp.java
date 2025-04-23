package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RldusInEocTgp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RldusInEocTgp extends RldusInEocTgpSerialized { 
   

						private char[] rldusTgpRec = Field.fillLowValue(161);
	
	/**
	* Constructor for RldusInEocTgp
	**/
    public RldusInEocTgp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RldusInEocTgp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocTgp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rldusTgpRec
	 *	@return rldusTgpRec
	 */
   public char[] getRldusTgpRec() throws CFException{
     if (isRldusTgpRecModified()) { 
        rldusTgpRec = refreshRldusTgpRec();
     }
   		return rldusTgpRec;
   }

  
	/**
	*  set variable rldusTgpRec
	*  Corresponding COBOL Variable is RLDUS-TGP-REC
	*  @param value
	**/
   public void setRldusTgpRec(char[] value) {
      rldusTgpRec = checkRldusTgpRecConstraints(value);
      serializeRldusTgpRec(rldusTgpRec);
   } 

     /**
	 * 	Update RldusTgpRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRldusTgpRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRldusTgpRec,rldusTgpRec.length);
   	
   }
   
   public void setRldusTgpRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRldusTgpRec,rldusTgpRec.length);
   	
   }
   
     /**
	 * 	Update RldusTgpRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusTgpRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusTgpRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RldusTgpRec with another Field
	 *	@param value
	 */
   public void setRldusTgpRec(Field source) {
       replace(source,0,source.length(),beginRldusTgpRec,RLDUS_TGP_REC_LEN);
   	
   }  
   
     /**
	 * 	Update RldusTgpRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRldusTgpRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRldusTgpRec,RLDUS_TGP_REC_LEN);
   	
   }
   
     /**
	 * 	Update RldusTgpRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusTgpRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusTgpRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRldusInEocTgpFieldLength() {
			return RLDUS_IN_EOC_TGP_LENGTH;
		}

}
  
