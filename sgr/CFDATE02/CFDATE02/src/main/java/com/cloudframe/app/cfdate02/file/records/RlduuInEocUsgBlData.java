package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlduuInEocUsgBlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RlduuInEocUsgBlData extends RlduuInEocUsgBlDataSerialized {
   
				@Getter @Setter private RlduuInEocUsgBlDtl rlduuInEocUsgBlDtl = new RlduuInEocUsgBlDtl();
				@Getter @Setter private RlduuInEocUsgBlHdr rlduuInEocUsgBlHdr = new RlduuInEocUsgBlHdr();
				@Getter @Setter private RlduuInEocUsgBlTlr rlduuInEocUsgBlTlr = new RlduuInEocUsgBlTlr();
	
	/**
	* Constructor for RlduuInEocUsgBlData
	**/
    public RlduuInEocUsgBlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRlduuInEocUsgBlDtl().setParent(this,getStartOffset() + 0);
					getRlduuInEocUsgBlHdr().setParent(this,getStartOffset() + 0);
					getRlduuInEocUsgBlTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
