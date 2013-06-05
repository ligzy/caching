/*
 	Copyright 2013 Woodside Consultancy Limited
 	
	This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package uk.ltd.woodsideconsultancy.aop.cache.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import uk.ltd.woodsideconsultancy.aop.cache.CacheInterface;
/**
 * 
 * @author Gary Bennett
 *
 * Annotation for invalidating a cache
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Invalidate {
	/** specify a name for a cache */
	String name() default "";
	/** specify comma separating index to parameters used as cache key */
	String keys() default "";
    /** specify a particular implementation of caching */
    String implementation() default CacheInterface.DEFAULT;
}
