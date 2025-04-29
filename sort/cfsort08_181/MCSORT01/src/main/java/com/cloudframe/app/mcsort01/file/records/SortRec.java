package com.cloudframe.app.mcsort01.file.records;

/**
*  The class SortRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SortRec extends SortRecSerialized {
   
				@Getter @Setter private SortRec1 sortRec1 = new SortRec1();
				@Getter @Setter private SortRec2 sortRec2 = new SortRec2();
				@Getter @Setter private SortRec3 sortRec3 = new SortRec3();
				@Getter @Setter private SortRec4 sortRec4 = new SortRec4();
				@Getter @Setter private SortRec5 sortRec5 = new SortRec5();
	
	/**
	* Constructor for SortRec
	**/
    public SortRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSortRec1().setParent(this,getStartOffset() + 0);
					getSortRec2().setParent(this,getStartOffset() + 0);
					getSortRec3().setParent(this,getStartOffset() + 0);
					getSortRec4().setParent(this,getStartOffset() + 0);
					getSortRec5().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
