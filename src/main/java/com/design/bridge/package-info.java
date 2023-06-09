/**
 * <p>
 *      桥模式：将类的功能层次结构与实现层次结构分离
 *      <ul>
 *          <li>类的功能层次结构：父类中放置基本功能，子类中放置新功能</li>
 *          <li>类的实现层次结构：父类通过声明抽象方法来定义接口，子类通过实现具体方法来实现接口</li>
 *      </ul>
 * </p>
 * <p>
 *     角色：
 *     <ul>
 *         <li>抽象化，也就是规定了基本功能的类，持有一个实现者类，委托实现者类来实现这些功能</li>
 *         <li>具体的抽象化，集成自抽象化类，并扩展了功能</li>
 *         <li>实现者，抽象了一些用于实现抽象化类规定的功能的接口，具体实现交由子类</li>
 *         <li>具体实现者，实现了实现者类中的接口</li>
 *     </ul>
 * </p>
 * <p>
 *     使用：
 *     <ul>
 *         <li>当进行扩展时，根据扩展功能还是实现来决定扩展那一边</li>
 *         <li>新扩展的功能能够被所有实现者实现的前提是该功能建立在原有功能的基础上</li>
 *     </ul>
 * </p>
 */
package com.design.bridge;
