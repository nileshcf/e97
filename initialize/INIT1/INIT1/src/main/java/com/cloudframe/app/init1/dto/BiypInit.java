package com.cloudframe.app.init1.dto;

/**
*  The class BiypInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BiypInit extends BiypInitSerialized { 
   

								private int fillerc;
				private BiypPriorTbl biypPriorTbl = new BiypPriorTbl();
	
	/**
	* Constructor for BiypInit
	**/
    public BiypInit() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BiypInit. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypInit(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			biypPriorTbl.setParent(this,getStartOffset() + 4);
								setFillerc(0);
    } 

	/**
	 *	Returns the value of fillerc
	 *	@return fillerc
	 */
	public int getFillerc() throws CFException {
        if (isFillercModified()) { 
           fillerc = refreshFillerc();
        }
   		return fillerc;
	}
	
	/**
	 * 	Update Fillerc with the passed value
	 *  Corresponding COBOL Variable is FILLERC
	 *	@param number
	 */
	public void setFillerc(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fillerc = checkFillercMaxLimit(number); 
		serializeFillerc(fillerc);
	}


	public void setFillerc(long number) {
	    number = checkFillercMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFillerc((int)number);
	}
	
	/**
	 *	Returns the value of biypPriorTbl
	 *	@return biypPriorTbl
	 */   
	 public BiypPriorTbl getBiypPriorTbl() {
   	return biypPriorTbl;
   }
   /**
	* 	Update BiypPriorTbl with the passed value
	*   Corresponding COBOL Variable is WS-BIYP-PRIOR-TBL
	*	@param value
	*/
   public void setBiypPriorTbl(char[] value) {
      biypPriorTbl.setString(value); 
   }   
    
     /**
	 * 	Update BiypPriorTbl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBiypPriorTbl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biypPriorTbl.begin,biypPriorTbl.length());
   }
   
     /**
	 * 	Update BiypPriorTbl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBiypPriorTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biypPriorTbl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BiypPriorTbl with another Field
	 *	@param value
	 */
   public void setBiypPriorTbl(Field source) {
   	replace(source,0,source.length(),biypPriorTbl.begin,biypPriorTbl.length());
   }  
   
     /**
	 * 	Update BiypPriorTbl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBiypPriorTbl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biypPriorTbl.begin,biypPriorTbl.length());
   }
   
     /**
	 * 	Update BiypPriorTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBiypPriorTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biypPriorTbl.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBiypInitFieldLength() {
			return BIYP_INIT_LENGTH;
		}

}
  
