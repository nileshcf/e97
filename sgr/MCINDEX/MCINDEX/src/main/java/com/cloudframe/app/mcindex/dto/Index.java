package com.cloudframe.app.mcindex.dto;

/**
*  The class Index is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import java.util.*;


@Data
public class Index extends IndexSerialized {
   
      private List<Integer> zeroIdx4800; 

			@Getter @Setter private List<IndexTbl1800> indexTbl1800 = new ArrayList<>();
    	
	
	/**
	* Constructor for Index
	**/
    public Index() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < INDEX_TBL_1800_SIZE;arrayIndex++) {
						getIndexTbl1800().add(new IndexTbl1800(this, beginIndexTbl1800 + 
						arrayIndex * IndexTbl1800.getIndexTbl1800FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
