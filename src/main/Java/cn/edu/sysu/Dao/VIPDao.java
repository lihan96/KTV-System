package cn.edu.sysu.Dao;

import cn.edu.sysu.Entity.VIP;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Project name: KTV-System
 * Package name: cn.edu.sysu.Dao
 * Created by Houben on 2018/4/5
 * Description:VIP数据访问接口，提供
 * 添加，删除，查询vip会员的功能
 */
public interface VIPDao {
    /**
     * 商家添加VIP会员
     *
     * @param vip 将要添加的VIP会员
     * @return 修改数据库的行数
     */
    void addVIP(VIP vip);

    /**
     * 商家删除VIP会员
     *
     * @param cname 将要被删除的VIP会员名字
     * @return 修改数据库的行数
     */
    void deleteVIP(String cname);

    /**
     * 查询所有VIP会员信息
     *
     * @return 返回所有会员列表
     */
    List<VIP> queryAllVIP();

    /**
     * 根据姓名信息查询VIP会员信息
     *
     * @param id VIP会员编号
     * @return 返回符合姓名查询的VIP
     */
    VIP queryVIPById(int id);

    /**
     * 根据姓名信息查询VIP会员信息
     *
     * @param cname VIP会员姓名
     * @return 返回符合姓名查询的VIP
     */
    VIP queryVIPByName(String cname);

    /**
     * 根据电话查询VIP信息
     *
     * @param phone VIP会员电话号码
     * @return 返回电话号码为phone的VIP
     */
    VIP queryVIPByPhone(String phone);

    /**
     * 更改会员名
     *
     * @param id    需要更改的VIP会员编号
     * @param cname 新的VIP会员名字
     * @return 修改数据库的行数
     */
    int changeName(@Param("id") int id, @Param("cname") String cname);
}
