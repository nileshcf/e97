package com.cloudframe.app.mcsort01.dto;

/**
*  The class SortKeyLthTable700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class SortKeyLthTable700 extends SortKeyLthTable700Serialized {
   
			@Getter @Setter private List<SortKeyLthEntry700> sortKeyLthEntry700 = new ArrayList<>();
    	
	
	/**
	* Constructor for SortKeyLthTable700
	**/
    public SortKeyLthTable700() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SORT_KEY_LTH_ENTRY_700_SIZE;arrayIndex++) {
						getSortKeyLthEntry700().add(new SortKeyLthEntry700(this, beginSortKeyLthEntry700 + 
						arrayIndex * SortKeyLthEntry700.getSortKeyLthEntry700FieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < SORT_KEY_LTH_ENTRY_700_SIZE;arrayIndex++) {
					getSortKeyLthEntry700().add(new SortKeyLthEntry700(this, beginSortKeyLthEntry700 + 
						arrayIndex * SortKeyLthEntry700.getSortKeyLthEntry700FieldLength()));
			}
    }





}
  
