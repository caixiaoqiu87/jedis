package redis.clients.jedis.commands;

import java.util.List;

import redis.clients.jedis.args.BitOP;
import redis.clients.jedis.params.BitPosParams;
import redis.clients.jedis.params.GetExParams;
import redis.clients.jedis.params.SetParams;
import redis.clients.jedis.params.StrAlgoLCSParams;
import redis.clients.jedis.resps.LCSMatchResult;

public interface StringBinaryCommands {

  String set(byte[] key, byte[] value);

  String set(byte[] key, byte[] value, SetParams params);

  byte[] get(byte[] key);

  byte[] getDel(byte[] key);

  byte[] getEx(byte[] key, GetExParams params);

  boolean setbit(byte[] key, long offset, boolean value);

  boolean getbit(byte[] key, long offset);

  long setrange(byte[] key, long offset, byte[] value);

  byte[] getrange(byte[] key, long startOffset, long endOffset);

  byte[] getSet(byte[] key, byte[] value);

  long setnx(byte[] key, byte[] value);

  String setex(byte[] key, long seconds, byte[] value);

  String psetex(byte[] key, long milliseconds, byte[] value);

  List<byte[]> mget(byte[]... keys);

  String mset(byte[]... keysvalues);

  long msetnx(byte[]... keysvalues);

  long incr(byte[] key);

  long incrBy(byte[] key, long increment);

  double incrByFloat(byte[] key, double increment);

  long decr(byte[] key);

  long decrBy(byte[] key, long decrement);

  long append(byte[] key, byte[] value);

  byte[] substr(byte[] key, int start, int end);

  long strlen(byte[] key);

  long bitcount(byte[] key);

  long bitcount(byte[] key, long start, long end);

  long bitpos(byte[] key, boolean value);

  long bitpos(byte[] key, boolean value, BitPosParams params);

  List<Long> bitfield(byte[] key, byte[]... arguments);

  List<Long> bitfieldReadonly(byte[] key, byte[]... arguments);

  long bitop(BitOP op, byte[] destKey, byte[]... srcKeys);

  LCSMatchResult strAlgoLCSKeys(final byte[] keyA, final byte[] keyB, final StrAlgoLCSParams params);
}
