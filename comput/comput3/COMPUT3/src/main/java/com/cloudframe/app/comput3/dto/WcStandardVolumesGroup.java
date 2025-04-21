package com.cloudframe.app.comput3.dto;

/**
*  The class WcStandardVolumesGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcStandardVolumesGroup extends WcStandardVolumesGroupSerialized {
   
					private WcStandardVolumes wcStandardVolumes = new WcStandardVolumes();
					private WcVolumeTable wcVolumeTable = new WcVolumeTable();
	
	/**
	* Constructor for WcStandardVolumesGroup
	**/
    public WcStandardVolumesGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wcStandardVolumes.setParent(this,getStartOffset() + 0);
	       			wcVolumeTable.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wcStandardVolumes
	 *	@return wcStandardVolumes
	 */   
	 public WcStandardVolumes getWcStandardVolumes() {
   	return wcStandardVolumes;
   }
   /**
	* 	Update WcStandardVolumes with the passed value
	*   Corresponding COBOL Variable is WC-STANDARD-VOLUMES
	*	@param value
	*/
   public void setWcStandardVolumes(char[] value) {
      wcStandardVolumes.setString(value); 
   }   
    
     /**
	 * 	Update WcStandardVolumes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcStandardVolumes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcStandardVolumes.begin,wcStandardVolumes.length());
   }
   
     /**
	 * 	Update WcStandardVolumes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcStandardVolumes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcStandardVolumes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcStandardVolumes with another Field
	 *	@param value
	 */
   public void setWcStandardVolumes(Field source) {
   	replace(source,0,source.length(),wcStandardVolumes.begin,wcStandardVolumes.length());
   }  
   
     /**
	 * 	Update WcStandardVolumes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcStandardVolumes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcStandardVolumes.begin,wcStandardVolumes.length());
   }
   
     /**
	 * 	Update WcStandardVolumes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcStandardVolumes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcStandardVolumes.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcVolumeTable
	 *	@return wcVolumeTable
	 */   
	 public WcVolumeTable getWcVolumeTable() {
   	return wcVolumeTable;
   }
   /**
	* 	Update WcVolumeTable with the passed value
	*   Corresponding COBOL Variable is WC-VOLUME-TABLE
	*	@param value
	*/
   public void setWcVolumeTable(char[] value) {
      wcVolumeTable.setString(value); 
   }   
    
     /**
	 * 	Update WcVolumeTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcVolumeTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcVolumeTable.begin,wcVolumeTable.length());
   }
   
     /**
	 * 	Update WcVolumeTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcVolumeTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcVolumeTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcVolumeTable with another Field
	 *	@param value
	 */
   public void setWcVolumeTable(Field source) {
   	replace(source,0,source.length(),wcVolumeTable.begin,wcVolumeTable.length());
   }  
   
     /**
	 * 	Update WcVolumeTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcVolumeTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcVolumeTable.begin,wcVolumeTable.length());
   }
   
     /**
	 * 	Update WcVolumeTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcVolumeTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcVolumeTable.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWcStandardVolumesGroupFieldLength() {
			return WC_STANDARD_VOLUMES_GROUP_LENGTH;
		}

}
  
