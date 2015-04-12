/*     / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.algebra;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.Function1;
import javaslang.Function2;
import javaslang.Tuple2;

/**
 * <p>Defines a 2-ary Functor by generalizing the map function which maps two elements.</p>
 *
 * All instances of the Functor2 interface should obey the two functor laws:
 * <ul>
 *     <li>{@code m.map(a -> a) ≡ m}</li>
 *     <li>{@code m.map(f.compose(g)) ≡ m.map(g).map(f)}</li>
 * </ul>
 * where {@code f, g ∈ Tuple2 → Tuple2}.
 *
 * @param <T1> 1st component type of this monad
 * @param <T2> 2nd component type of this monad
 * @see <a href="http://www.haskellforall.com/2012/09/the-functor-design-pattern.html">The functor design pattern</a>
 * @since 1.1.0
 */
public interface Functor2<T1, T2> {

    /**
     * Applies a function f to the components of this Functor.
     *
     * @param <U1> type of the 1st component of the resulting Functor
     * @param <U2> type of the 2nd component of the resulting Functor
     * @param f a 2-ary Function which maps the components of this Functor
     * @return a new Functor2 with two component types U1, U2.
     */
    <U1, U2> Functor2<U1, U2> map(Function2<? super T1, ? super T2, Tuple2<? extends U1, ? extends U2>> f);

    /**
     * Applies a separate function to each component of this Functor.
     *
     * @param <U1> type of the 1st component of the resulting Functor
     * @param <U2> type of the 2nd component of the resulting Functor
     * @param f1 the Function applied to the 1st component of this Functor
     * @param f2 the Function applied to the 2nd component of this Functor
     * @return a new Functor2 with two component types U1, U2.
     */
    <U1, U2> Functor2<U1, U2> map(Function1<? super T1, ? extends U1> f1, Function1<? super T2, ? extends U2> f2);
}