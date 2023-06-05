/**
 * 备忘录模式，保存对象的状态，实现将对象的某个时间点的状态保存下来，之后有必要时，再回溯到该时间点
 * <p>
 *     角色：
 *     <ul>
 *         <li>生成者，在想要备份自身状态时生成备忘录角色，在想要恢复以前状态是接收备忘录角色</li>
 *         <li>备忘录，将生成者内部信息整合在一起，不公开或者部分公开</li>
 *         <li>负责人，当想要备份当前生成者时，通知其备份，并保存生成的备忘录对象；当想要恢复生成者状态时，将备忘录对象传递给生成者</li>
 *     </ul>
 *     使用：
 *     <ul>
 *         <li>备忘录提供两种接口，宽接口-基本上能够暴露生成者当时所有状态信息，提供给生成者使用；窄接口-只暴露用到的部分状态信息，可以提供给负责人使用</li>
 *     </ul>
 * </p>
 */
package com.design.memento;