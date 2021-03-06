package cn.edu.sysu.Dao;

import cn.edu.sysu.Entity.Room;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Project name: KTV-System
 * Package name: cn.edu.sysu.Dao
 * Created by lihan on 2018/4/6
 * Description: Room的数据访问层接口，
 * 提供向数据库中添加、删除Room、改变
 * Room的状态以及查询所有房间或者查询
 * 空房间的方法。
 */
public interface RoomDao {

    /**
     * 商家向数据库中添加房间
     *
     * @param room 将要被添加的房间
     */
    void addRoom(Room room);

    /**
     * 商家删除数据库中的房间
     *
     * @param id   将要删除的房间
     * @param type 将要删除的房间类型
     */
    void deleteRoom(@Param("id") int id, @Param("type") String type);

    /**
     * 根据给定的房间类型、房间编号、开始时间以
     * 及消费时长来订房，修改房间状态为使用
     *
     * @param id        房间编号
     * @param type      房间类型
     * @param startTime 消费开始时间
     * @param hours     消费小时数
     * @return 修改数据库的行数
     */
    int bookingRoom(@Param("id") int id, @Param("type") String type,
                    @Param("startTime") Date startTime, @Param("hours") int hours);

    /**
     * 根据给定的房间类型、房间编号来结束使用
     * 房间，修改房间状态为空
     *
     * @param id   房间编号
     * @param type 房间类型
     * @return 修改数据库的行数
     */
    int checkoutRoom(@Param("id") int id, @Param("type") String type);

    /**
     * 根据给定的房间类型、房间编号、续费时间
     * 来进行续费，修改房间的结束使用时间
     *
     * @param id    房间编号
     * @param type  房间类型
     * @param hours 续费小时数
     * @return 修改数据库的行数
     */
    int renewRoom(@Param("id") int id, @Param("type") String type, @Param("hours") int hours);

    /**
     * 根据给定的房间类型和房间编号查询房间
     *
     * @param id   房间编号
     * @param type 房间类型
     * @return 返回该房间
     */
    Room queryRoom(@Param("id") int id, @Param("type") String type);

    /**
     * 查询所有房间
     *
     * @return 所有的房间列表
     */
    List<Room> queryAllRoom();

    /**
     * 查询状态为空的房间
     *
     * @return 状态为空的房间列表
     */
    List<Room> queryEmptyRoom();

    /**
     * 根据给定房间类型查询状态为空的房间
     *
     * @param type 房间类型
     * @return 给定类型状态为空的房间
     */
    List<Room> queryEmptyRoomByType(String type);

}
